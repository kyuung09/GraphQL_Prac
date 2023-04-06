package com.example.graphql_prac_;

import com.example.graphql_prac_.DTO.UserRequestDto;
import com.example.graphql_prac_.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

//@DataJpaTest
@SpringBootTest
class GraphQlPracApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Order(1)
    @Transactional
    @Rollback
    @DisplayName("사용자 생성")
    public void createUserTest() {
        userRepository.createUser(new UserRequestDto(1, "kyuu@1234.com", "1234", "kyuu"));
    }

    @Test
    @Order(2)
    @Transactional
    @Rollback
    @DisplayName("사용자 정보 업데이트")
    public void updateUserTest() {
        UserRequestDto userRequestDto = UserRequestDto.builder()
                        .user_id(1)
                        .build();
        userRepository.updateUser(userRequestDto);
    }

    @Test
    @Order(3)
    @Transactional
    @Rollback
    @DisplayName("사용자 삭제")
    public void deleteUserTest() {
        UserRequestDto userRequestDto = UserRequestDto.builder()
                .user_id(1)
                .build();
        userRepository.deleteUser(userRequestDto);
    }


    @AfterEach
    @Transactional
    @Rollback
    @DisplayName("사용자 조회")
    public void selectUserTest() {
        userRepository.getUsers();
    }

}
