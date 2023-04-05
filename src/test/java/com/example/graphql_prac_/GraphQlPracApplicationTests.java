package com.example.graphql_prac_;

import com.example.graphql_prac_.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
//@SpringBootTest
class GraphQlPracApplicationTests {

    @Autowired
    private UserRepository userRepository;
//
//    @Test
//    @Transactional
//    @Rollback
//    @DisplayName("mybatis 회원가입 테스트")
//    public void memberSaveTest1() {
//        userRepository.save1(new UserMapperDTO("mybatis회원이메일", "mybatis회원비밀번호", "mybatis회원이름"));
//    }
}
