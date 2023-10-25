package com.rdi.electioner.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationRequest {
    private String email;
    private String password;
    private String organisation;
}
