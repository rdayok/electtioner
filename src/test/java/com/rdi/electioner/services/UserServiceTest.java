package com.rdi.electioner.services;

import com.rdi.electioner.dto.requests.UserRegistrationRequest;
import com.rdi.electioner.dto.responses.UserRegistrationResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUserRegistration() {
        UserRegistrationRequest userRegistrationRequest = new UserRegistrationRequest();
        userRegistrationRequest.setEmail("dayokr@gmail.com");
        userRegistrationRequest.setPassword("password");
        userRegistrationRequest.setOrganisation("BMT");

        UserRegistrationResponse userRegistrationResponse
                = userService.register(userRegistrationRequest);
        assertNotNull(userRegistrationResponse);
    }
}
