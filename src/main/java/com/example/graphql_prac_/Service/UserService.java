package com.example.graphql_prac_.Service;

import com.example.graphql_prac_.DTO.UserResponseDto;
import com.example.graphql_prac_.DTO.UserRequestDto;

import java.util.List;

public interface UserService {
    void createUser(UserRequestDto userRequestDto);
    List<UserResponseDto> getUsers();
}
