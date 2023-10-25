package com.rdi.electioner.services;

import com.rdi.electioner.data.models.User;
import com.rdi.electioner.data.repositories.UserRepository;
import com.rdi.electioner.dto.requests.UserRegistrationRequest;
import com.rdi.electioner.dto.responses.UserRegistrationResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ElectionerUserService implements UserService{

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    @Override
    public UserRegistrationResponse register(UserRegistrationRequest userRegistrationRequest) {
        User user = modelMapper.map(userRegistrationRequest, User.class);
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserRegistrationResponse.class);
    }
}
