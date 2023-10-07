package com.rdi.electioner.services;

import com.rdi.electioner.dto.requests.VoterRegistrationRequest;
import com.rdi.electioner.dto.responses.VoterRegistrationResponse;

public interface VoterService {

    VoterRegistrationResponse register(VoterRegistrationRequest voterRegistrationRequest);
}
