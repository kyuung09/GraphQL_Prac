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
    public UserResponseDto createUser(UserRequestDto userRequestDto){
        userRepository.createUser(userRequestDto);
        UserResponseDto userResponseDto = userRepository.getUserById(userRequestDto.getUser_id());
        return userResponseDto;
    }

    @Override
    public UserResponseDto updateUser(UserRequestDto userRequestDto) {
        userRepository.updateUser(userRequestDto);
        UserResponseDto userResponseDto = userRepository.getUserById(userRequestDto.getUser_id());
        return userResponseDto;
    }

    @Override
    public UserResponseDto deleteUser(UserRequestDto userRequestDto) {
        UserResponseDto userResponseDto = userRepository.getUserById(userRequestDto.getUser_id());
        userRepository.deleteUser(userRequestDto);
        return userResponseDto;
    }
}
