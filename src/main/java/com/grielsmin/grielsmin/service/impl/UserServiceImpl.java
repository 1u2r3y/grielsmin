package com.grielsmin.grielsmin.service.impl;

import com.grielsmin.grielsmin.model.User;
import com.grielsmin.grielsmin.repository.UserRepository;
import com.grielsmin.grielsmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {return userRepository.findUserById(id);}

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }
}
