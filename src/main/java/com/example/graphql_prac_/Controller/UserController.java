package com.example.graphql_prac_.Controller;

import com.example.graphql_prac_.DTO.UserResponseDto;
import com.example.graphql_prac_.DTO.UserRequestDto;
import com.example.graphql_prac_.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // 전체 조회
    @QueryMapping
    public List<UserResponseDto> getUsers() {
        return userService.getUsers();
    }

    // 사용자 조회
    @QueryMapping
    public UserResponseDto getUserById(@Argument UserRequestDto userRequestDtoInfo) {
        return userService.getUserById(userRequestDtoInfo);
    }

    // 사용자 생성
    @MutationMapping
    public UserResponseDto createUser(@Argument UserRequestDto userRequestDtoInfo){
        return userService.createUser(userRequestDtoInfo);
    }

    // 사용자 정보 업데이트
    @MutationMapping
    public UserResponseDto updateUser(@Argument UserRequestDto userRequestDtoInfo){
        return userService.updateUser(userRequestDtoInfo);
    }

    // 사용자 삭제
    @MutationMapping
    public UserResponseDto deleteUser(@Argument UserRequestDto userRequestDtoInfo){
        return userService.deleteUser(userRequestDtoInfo);
    }
}
