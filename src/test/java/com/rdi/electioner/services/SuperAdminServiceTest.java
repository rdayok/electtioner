package com.rdi.electioner.services;

import com.rdi.electioner.dto.requests.SuperAdminRegistrationRequest;
import com.rdi.electioner.dto.responses.SuperAdminRegistrationResponse;
import com.rdi.electioner.exceptions.AnUnauthorizedRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SuperAdminServiceTest {

    @Autowired
    private SuperAdminService superAdminService;


    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testSuperAdminOneTimeRegistration() throws AnUnauthorizedRequest {

        SuperAdminRegistrationRequest superAdminRegistrationRequest = new SuperAdminRegistrationRequest();
        superAdminRegistrationRequest.setName("Admin");
        superAdminRegistrationRequest.setPassword("SUPERadmin");

        SuperAdminRegistrationResponse superAdminRegistrationResponse =
                superAdminService.register(superAdminRegistrationRequest);

        assertNotNull(superAdminRegistrationResponse);
        assertEquals("REGISTRATION SUCCESSFUL", superAdminRegistrationResponse.getRegistrationFeedback());
    }


//    @Test
//    public void testSuperAdminCannotBeRegisteredAgain() throws AnUnauthorizedRequest {
//        SuperAdminRegistrationRequest superAdminRegistrationRequest = new SuperAdminRegistrationRequest();
//        superAdminRegistrationRequest.setName("Admin");
//        superAdminRegistrationRequest.setPassword("SUPERadmin");
//
//        SuperAdminRegistrationResponse superAdminRegistrationResponse =
//                superAdminService.register(superAdminRegistrationRequest);
//
//        assertThrows(AnUnauthorizedRequest.class, () -> superAdminService.register(superAdminRegistrationRequest));
//    }

}
