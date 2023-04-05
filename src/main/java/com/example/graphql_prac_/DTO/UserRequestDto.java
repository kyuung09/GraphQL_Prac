package com.example.graphql_prac_.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserRequestDto {
    private String user_email;
    private String user_password;
    private String user_name;
}
