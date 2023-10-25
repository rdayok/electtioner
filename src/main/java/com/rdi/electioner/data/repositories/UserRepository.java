package com.rdi.electioner.data.repositories;

import com.rdi.electioner.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
