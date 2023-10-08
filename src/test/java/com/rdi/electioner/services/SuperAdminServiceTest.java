package com.rdi.electioner.services;

import com.rdi.electioner.dto.requests.SuperAdminRegistrationRequest;
import com.rdi.electioner.dto.responses.SuperAdminRegistrationResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class SuperAdminServiceTest {

    @Autowired
    private SuperAdminService superAdminService;

    @Test
    public void testSuperAdminOneTimeRegistration() {

        SuperAdminRegistrationRequest superAdminRegistrationRequest = new SuperAdminRegistrationRequest();
        superAdminRegistrationRequest.setName("Admin");
        superAdminRegistrationRequest.setPassword("SUPERadmin");

        SuperAdminRegistrationResponse superAdminRegistrationResponse =
                superAdminService.register(superAdminRegistrationRequest);

        assertNotNull(superAdminRegistrationResponse);
        assertEquals("REGISTRATION SUCCESSFUL", superAdminRegistrationResponse.getRegistrationFeedback());
    }

}
