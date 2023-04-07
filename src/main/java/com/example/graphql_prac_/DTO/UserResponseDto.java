package com.example.graphql_prac_.DTO;

import lombok.*;

@Getter
public class UserResponseDto {
    private Integer user_id;                                                                                             // ID
    private String user_email;                                                                                           // 사용자 이메일
    private String user_password;                                                                                        // 사용자 패스워드
    private String user_name;                                                                                            // 사용자 이름

    @Builder
    public UserResponseDto(Integer user_id, String user_email, String user_password, String user_name){
        this.user_id = user_id;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_name = user_name;
    }
}
