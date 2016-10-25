package com.schoolofnet.son_security.service;

import com.schoolofnet.son_security.models.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
