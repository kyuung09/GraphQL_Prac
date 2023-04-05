package com.example.graphql_prac_.Service;

import com.example.graphql_prac_.DTO.UserResponseDto;
import com.example.graphql_prac_.DTO.UserRequestDto;
import com.example.graphql_prac_.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void createUser(UserRequestDto userRequestDto){
        userRepository.createUser(userRequestDto);
    }

    @Override
    public List<UserResponseDto> getUsers() {
        return userRepository.getUsers();
    }
}
