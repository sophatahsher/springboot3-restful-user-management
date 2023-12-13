package com.sophatchhay.springboot.service;

//import com.sophatchhay.springboot.dto.UserDto;
import com.sophatchhay.springboot.entity.UserEntity;
//import com.sophatchhay.springboot.mapper.UserMapper;
import com.sophatchhay.springboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity user) {
        System.out.println(this.findUserByEmail(user));

        UserEntity record = this.findUserByEmail(user);
        if(Objects.isNull(record)) {
            return userRepository.save(user);
        }else {
            return record;
        }
    }

    @Override
    public UserEntity getUserById(Long userId) {
        Optional<UserEntity> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
//        Optional<UserEntity> optionalUser = userRepository.findById(userId);
//        UserEntity user = optionalUser.get();
//        return UserMapper.mapToUserDto(user);
    }

    public UserEntity findUserByEmail(UserEntity user) {
        Optional<UserEntity> userExist = this.userRepository.findUserByEmail(user.getEmail());
        //return userExist.map().orElse(null);
        return userExist.get();
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
        //        List<UserEntity> users = userRepository.findAll();
        //        return users.stream().map(UserMapper::mapToUserDto).collect(Collectors.toList());
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
//        UserEntity existingUser = userRepository.findById(user.getId()).get();
//        existingUser.setFirstName(user.getFirstName());
//        existingUser.setLastName(user.getLastName());
//        existingUser.setEmail(user.getEmail());
//        UserEntity updatedUser = userRepository.save(existingUser);
//        return UserMapper.mapToUserDto(updatedUser);

        UserEntity existingUser = userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
