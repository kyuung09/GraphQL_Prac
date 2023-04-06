package com.example.graphql_prac_.DTO;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserRequestDto {
    private Integer user_id;
    private String user_email;
    private String user_password;
    private String user_name;

    @Builder
    public UserRequestDto(Integer user_id, String user_email, String user_password, String user_name){
        this.user_id = user_id;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_name = user_name;
    }
}
