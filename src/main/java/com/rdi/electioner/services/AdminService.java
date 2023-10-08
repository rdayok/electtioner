package com.rdi.electioner.services;

import com.rdi.electioner.dto.requests.ChairmanRegistrationRequest;
import com.rdi.electioner.dto.responses.AdminRegistrationResponse;


public interface AdminService {
    AdminRegistrationResponse register(ChairmanRegistrationRequest adminRegistrationResquest);
}
