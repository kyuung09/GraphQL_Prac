package com.example.graphql_prac_.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserResponseDto {
    private Integer user_id;
    private String user_email;
    private String user_password;
    private String user_name;
}
