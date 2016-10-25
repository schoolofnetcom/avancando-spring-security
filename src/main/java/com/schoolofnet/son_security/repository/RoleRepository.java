package com.schoolofnet.son_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolofnet.son_security.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
