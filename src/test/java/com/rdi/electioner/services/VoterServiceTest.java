package com.rdi.electioner.services;

import com.rdi.electioner.dto.requests.VoterRegistrationRequest;
import com.rdi.electioner.dto.responses.VoterRegistrationResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static com.rdi.electioner.dto.requests.State.JOS;
import static java.util.Calendar.SEPTEMBER;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class VoterServiceTest {


    @Autowired
    private VoterService voterService;

    @Test
    public void testVoterRegistration() {
        VoterRegistrationRequest voterRegistrationRequest =
                new VoterRegistrationRequest();
        voterRegistrationRequest.setFirstName("Retnaa");
        voterRegistrationRequest.setLastName("Dayok");
        voterRegistrationRequest.setPassword("Iam_zyen");
        voterRegistrationRequest.setState(JOS);
        voterRegistrationRequest.setDateOfBirth(LocalDate.of(2000, SEPTEMBER, 8));

        VoterRegistrationResponse voterRegistrationResponse =
                voterService.register(voterRegistrationRequest);
        assertNotNull(voterRegistrationResponse);
        assertNotNull(voterRegistrationResponse.getVoterId());
    }

}
