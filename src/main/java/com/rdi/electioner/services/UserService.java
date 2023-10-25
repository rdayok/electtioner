package com.rdi.electioner.services;

import com.rdi.electioner.dto.requests.UserRegistrationRequest;
import com.rdi.electioner.dto.responses.UserRegistrationResponse;

public interface UserService {
    UserRegistrationResponse register(UserRegistrationRequest userRegistrationRequest);
}
