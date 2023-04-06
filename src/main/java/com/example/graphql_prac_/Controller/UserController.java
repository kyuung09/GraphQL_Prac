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
    public UserResponseDto getUserById(@Argument Integer user_id) {
        UserRequestDto userRequestDto = UserRequestDto.builder()
                .user_id(user_id)
                .build();
        return userService.getUserById(userRequestDto);
    }


    // 사용자 생성
    @MutationMapping
    public void createUser(@Argument String user_name, @Argument String user_email, @Argument String user_password){
        UserRequestDto userRequestDto = UserRequestDto.builder()
                        .user_name(user_name)
                        .user_email(user_email)
                        .user_password(user_password)
                        .build();
        userService.createUser(userRequestDto);
    }

    // 사용자 정보 업데이트
    @MutationMapping
    public void updateUser(@Argument Integer user_id, @Argument String user_email){
        UserRequestDto userRequestDto = UserRequestDto.builder()
                .user_id(user_id)
                .user_email(user_email)
                .build();
        userService.updateUser(userRequestDto);
    }

    // 사용자 삭제
    @MutationMapping
    public void deleteUser(@Argument Integer user_id){
        UserRequestDto userRequestDto = UserRequestDto.builder()
                .user_id(user_id)
                .build();
        userService.deleteUser(userRequestDto);
    }
}
