package com.springboot.spring.service;

import com.springboot.spring.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
    User saveUser(User user);
    void deleteById(Long id);
}
