package com.rdi.electioner.services;

import com.rdi.electioner.exceptions.VoterNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class AdminServiceTest {

    @Autowired
    private AdminService adminService;
    @Test
    public void testRegisterAdmin() throws VoterNotFoundException {
        ChairmanRegistrationRequest chairmanRegistrationRequest =
                new ChairmanRegistrationRequest();
        chairmanRegistrationRequest.setVoterId(1L);
        AdminRegistrationResponse adminRegistrationResponse =
                adminService.register(chairmanRegistrationRequest);

        assertNotNull(adminRegistrationResponse);
        System.out.println(adminRegistrationResponse);
        assertNotNull(adminRegistrationResponse.getId());
    }
}
