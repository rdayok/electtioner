package com.rdi.electioner.services;

import com.rdi.electioner.dto.requests.AdminRegistrationRequest;
import com.rdi.electioner.dto.responses.AdminRegistrationResqponse;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    AdminRegistrationResqponse register(AdminRegistrationRequest adminRegistrationResquest);
}
