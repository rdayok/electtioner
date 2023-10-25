package com.rdi.electioner.services;

import com.rdi.electioner.dto.requests.SuperAdminRegistrationRequest;
import com.rdi.electioner.dto.responses.SuperAdminRegistrationResponse;
import com.rdi.electioner.exceptions.AnUnauthorizedRequest;

public interface SuperAdminService {
    SuperAdminRegistrationResponse register(SuperAdminRegistrationRequest superAdminRegistrationRequest) throws AnUnauthorizedRequest;
}
