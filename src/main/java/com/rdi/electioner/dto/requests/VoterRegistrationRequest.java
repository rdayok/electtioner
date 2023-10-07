package com.rdi.electioner.dto.requests;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class VoterRegistrationRequest {
    private String firstName;
    private String lastName;
    private String password;
    private State state;
    private LocalDate dateOfBirth;
}
