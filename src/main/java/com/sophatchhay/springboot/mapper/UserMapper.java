//package com.sophatchhay.springboot.mapper;
//
//import com.sophatchhay.springboot.dto.UserDto;
//import com.sophatchhay.springboot.entity.UserEntity;
//
//public class UserMapper {
//    // Convert User JPA Entity into UserDto
//    public static UserDto mapToUserDto(UserEntity user){
//        return new UserDto(
//                user.getId(),
//                user.getFirstName(),
//                user.getLastName(),
//                user.getEmail()
//        );
//    }
//
//    // Convert UserDto into User JPA Entity
//    public static UserEntity mapToUser(UserDto userDto){
//        UserEntity user = new UserEntity(
//                userDto.getId(),
//                userDto.getFirstName(),
//                userDto.getLastName(),
//                userDto.getEmail()
//        );
//        return user;
//    }
//}
