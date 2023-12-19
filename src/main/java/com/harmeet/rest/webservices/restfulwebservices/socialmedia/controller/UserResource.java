package com.harmeet.rest.webservices.restfulwebservices.socialmedia.controller;

import com.harmeet.rest.webservices.restfulwebservices.socialmedia.dao.UserDaoService;
import com.harmeet.rest.webservices.restfulwebservices.socialmedia.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {
    private UserDaoService userDaoService;

    public UserResource(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUserById(@PathVariable Integer id) {
        return userDaoService.findByUserId(id);
    }
}
