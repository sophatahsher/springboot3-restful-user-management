package com.sophatchhay.springboot.service;

//import com.sophatchhay.springboot.dto.UserDto;
import com.sophatchhay.springboot.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserEntity createUser(UserEntity user);

    UserEntity getUserById(Long userId);

    List<UserEntity> getAllUsers();

    UserEntity updateUser(UserEntity user);

    UserEntity findUserByEmail(UserEntity user);

    void deleteUser(Long userId);
}
