package com.learn.controller;

import com.learn.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class HelloController {
    @PostMapping("users")
    public User saveUser(@RequestBody User user){
        System.out.println("User saved!");
        user.setPassword("");
        return user;
    }

    @PostMapping("users-all")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("All users saved!");
        users.forEach(user -> user.setPassword(""));
        return users;
    }
}
