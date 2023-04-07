package com.example.graphql_prac_.Entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;                                                                                             // Id

    @Column(nullable = false)
    private String user_name;                                                                                            // 사용자 이름

    @Column(nullable = false)
    private String user_password;                                                                                        // 사용자비밀번호

    @Column(nullable = true)
    private String user_email;                                                                                           // 사용자 이메일
}

