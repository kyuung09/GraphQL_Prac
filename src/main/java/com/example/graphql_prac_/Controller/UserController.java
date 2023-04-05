package com.example.graphql_prac_.Controller;

import com.example.graphql_prac_.DTO.UserResponseDto;
import com.example.graphql_prac_.DTO.UserRequestDto;
import com.example.graphql_prac_.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // 사용자 조회
    @QueryMapping
    public List<UserResponseDto> getUsers() {
        return userService.getUsers();
    }

    // 사용자 생성
    @MutationMapping
    public void createUser(@Argument String user_name, @Argument String user_email, @Argument String user_password){
        UserRequestDto userRequestDto = new UserRequestDto(user_name, user_email, user_password);
        userService.createUser(userRequestDto);
    }
}
