package com.rdi.electioner.services;

import com.rdi.electioner.data.models.SuperAdmin;
import com.rdi.electioner.data.repositories.SuperAdminRepository;
import com.rdi.electioner.dto.requests.SuperAdminRegistrationRequest;
import com.rdi.electioner.dto.responses.SuperAdminRegistrationResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ElectionerSuperAdminService implements SuperAdminService {

    private final ModelMapper mapper;
    private final SuperAdminRepository superAdminRepository;
    @Override
    public SuperAdminRegistrationResponse register(SuperAdminRegistrationRequest superAdminRegistrationRequest) {
        SuperAdmin superAdmin = mapper.map(superAdminRegistrationRequest, SuperAdmin.class);
        SuperAdmin registerredSuperAdmin = superAdminRepository.save(superAdmin);
        if(Objects.equals(registerredSuperAdmin.getName(), "Admin")){
            SuperAdminRegistrationResponse superAdminRegistrationResponse = new SuperAdminRegistrationResponse();
            superAdminRegistrationResponse.setRegistrationFeedback("REGISTRATION SUCCESSFUL");
            return superAdminRegistrationResponse;
        }
        return new SuperAdminRegistrationResponse();
    }
}
