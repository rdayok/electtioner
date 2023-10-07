package com.rdi.electioner.services;

import com.rdi.electioner.dto.requests.AdminRegistrationRequest;
import com.rdi.electioner.dto.responses.AdminRegistrationResqponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class AdminServiceTest {

    @Autowired
    private AdminService adminService;
    @Test
    public void testRegisterAdmin() {
        AdminRegistrationRequest adminRegistrationResquest =
                new AdminRegistrationRequest();
        adminRegistrationResquest.setVoterId(1L);
        adminRegistrationResquest.setPassword("max_man23");
        AdminRegistrationResqponse adminRegistrationResqponse =
                adminService.register(adminRegistrationResquest);

        assertNotNull(adminRegistrationResqponse);
        assertNotNull(adminRegistrationResqponse.getVoterId());
    }
}
