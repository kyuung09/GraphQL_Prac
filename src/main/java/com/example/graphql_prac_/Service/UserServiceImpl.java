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
    public List<UserResponseDto> getUsers() {
        return userRepository.getUsers();
    }

    @Override
    public UserResponseDto getUserById(UserRequestDto userRequestDto) {
        UserResponseDto userResponseDto = userRepository.getUserById(userRequestDto);
        return userResponseDto;
    }

    @Override
    public void createUser(UserRequestDto userRequestDto){
        userRepository.createUser(userRequestDto);
    }

    @Override
    public void updateUser(UserRequestDto userRequestDto) {
        userRepository.updateUser(userRequestDto);
    }

    @Override
    public void deleteUser(UserRequestDto userRequestDto) {
        userRepository.deleteUser(userRequestDto);
    }


}
