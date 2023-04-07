package com.example.graphql_prac_.Service;

import com.example.graphql_prac_.DTO.UserResponseDto;
import com.example.graphql_prac_.DTO.UserRequestDto;

import java.util.List;

public interface UserService {
    List<UserResponseDto> getUsers();
    UserResponseDto getUserById(UserRequestDto userRequestDto);
    UserResponseDto createUser(UserRequestDto userRequestDto);
    UserResponseDto updateUser(UserRequestDto userRequestDto);
    UserResponseDto deleteUser(UserRequestDto userRequestDto);

}
