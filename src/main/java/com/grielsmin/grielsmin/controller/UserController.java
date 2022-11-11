package com.grielsmin.grielsmin.controller;

import com.grielsmin.grielsmin.model.User;
import com.grielsmin.grielsmin.repository.UserRepository;
import com.grielsmin.grielsmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getOfUsers(){
        return userRepository.findAll();
    }

    @PostMapping(value = "/user", consumes = "application/json")
    public User addUser(@RequestBody User user){ return userService.add(user);}
}
