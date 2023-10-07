package com.rdi.electioner.data.repositories;

import com.rdi.electioner.data.models.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterRepository extends JpaRepository<Voter, Long> {
}
