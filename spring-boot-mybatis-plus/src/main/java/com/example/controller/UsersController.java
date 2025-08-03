package com.example.controller;

import com.example.entity.DO.UsersDO;
import com.example.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo/usersDO")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping("/add")
    public boolean addUser(@RequestBody UsersDO user) {
        return usersService.save(user);
    }

    @PutMapping("/update")
    public boolean updateUser(@RequestBody UsersDO user) {
        return usersService.updateById(user);
    }

    @GetMapping("/get")
    public UsersDO getUser(@RequestParam("id") String id) {
        return usersService.getById(id);
    }

    @GetMapping("/list")
    public List<UsersDO> listUsers() {
        return usersService.list();
    }
}