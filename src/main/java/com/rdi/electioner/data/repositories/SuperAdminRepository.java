package com.rdi.electioner.data.repositories;

import com.rdi.electioner.enums.Role;
import com.rdi.electioner.data.models.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperAdminRepository extends JpaRepository<SuperAdmin, String> {
    SuperAdmin findByRole(Role role);
}
