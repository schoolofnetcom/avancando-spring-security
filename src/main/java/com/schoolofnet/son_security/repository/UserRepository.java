package com.schoolofnet.son_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolofnet.son_security.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
