package com.rdi.electioner.services;

import com.rdi.electioner.data.models.Voter;
import com.rdi.electioner.data.repositories.VoterRepository;
import com.rdi.electioner.dto.requests.VoterRegistrationRequest;
import com.rdi.electioner.dto.responses.VoterRegistrationResponse;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class ElectionerVoterService implements VoterService{

    private final VoterRepository voterRepository;

    public ElectionerVoterService(VoterRepository voterRepository) {
        this.voterRepository = voterRepository;
    }

    @Override
    public VoterRegistrationResponse register(VoterRegistrationRequest voterRegistrationRequest) {
        Voter voter = new Voter();
        voter.setFirstName(voterRegistrationRequest.getFirstName());
        voter.setLastName(voterRegistrationRequest.getLastName());
        voter.setDateOfBirth(voterRegistrationRequest.getDateOfBirth());
        voter.setState(voterRegistrationRequest.getState());
        Voter savedVoter = voterRepository.save(voter);

        VoterRegistrationResponse voterRegistrationResponse = new VoterRegistrationResponse();
        voterRegistrationResponse.setVoterId(savedVoter.getId());
        voterRegistrationResponse.setFirstName(savedVoter.getFirstName());
        voterRegistrationResponse.setLastName(savedVoter.getLastName());
        voterRegistrationResponse.setDateOfBirth(savedVoter.getDateOfBirth().toString());
        voterRegistrationResponse.setState(savedVoter.getState().toString());
        return voterRegistrationResponse;
    }
}
