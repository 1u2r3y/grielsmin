package com.grielsmin.grielsmin.service;

import com.grielsmin.grielsmin.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User add(User user);
}
