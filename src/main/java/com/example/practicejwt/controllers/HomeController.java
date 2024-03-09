package com.example.practicejwt.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practicejwt.models.User;
import com.example.practicejwt.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public List<User> getUser() {

        return userService.getUsers();
    }

    @RequestMapping("/currentUser")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }

}
