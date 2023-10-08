package com.rdi.electioner.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static com.rdi.electioner.data.models.Role.SUPER_ADMIN;

@Entity
@Setter
@Getter
public class SuperAdmin {

    @Id
    private String name;
    private String password;
    private final Role role = SUPER_ADMIN;

}
