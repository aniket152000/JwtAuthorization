package com.example.practicejwt.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.practicejwt.models.User;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Aniket Ghare", "aniket@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ani Ghare", "ani@gmail.com"));

    }

    public List<User> getUsers() {
        return this.store;
    }
}
