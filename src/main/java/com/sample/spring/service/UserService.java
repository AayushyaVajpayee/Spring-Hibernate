package com.sample.spring.service;

import java.util.List;

import com.sample.spring.entity.User;

public interface UserService {
    void add(User user);
    List<User> listUsers();
}
