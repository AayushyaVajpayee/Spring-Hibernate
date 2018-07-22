package com.sample.spring.dao;

import java.util.List;

import com.sample.spring.entity.User;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
}
