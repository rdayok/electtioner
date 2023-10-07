package com.rdi.electioner.dto.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoterRegistrationResponse {
    private Long voterId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String state;
}
