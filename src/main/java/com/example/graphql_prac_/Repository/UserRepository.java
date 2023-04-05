package com.example.graphql_prac_.Repository;

import com.example.graphql_prac_.DTO.UserResponseDto;
import com.example.graphql_prac_.DTO.UserRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepository {
    void createUser(UserRequestDto userRequestDto);
    List<UserResponseDto> getUsers();
}
