package com.example.demo.service;

import com.example.demo.domain.User;

public interface UserService {
    void getUserById(User user);
    void insertUser(User user);
}
