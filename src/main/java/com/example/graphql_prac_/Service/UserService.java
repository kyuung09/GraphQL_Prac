package com.example.graphql_prac_.Service;

import com.example.graphql_prac_.DTO.UserResponseDto;
import com.example.graphql_prac_.DTO.UserRequestDto;

import java.util.List;

public interface UserService {

    List<UserResponseDto> getUsers();
    UserResponseDto getUserById(UserRequestDto userRequestDto);
    void createUser(UserRequestDto userRequestDto);
    void updateUser(UserRequestDto userRequestDto);
    void deleteUser(UserRequestDto userRequestDto);

}
