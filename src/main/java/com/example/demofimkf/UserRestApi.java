package com.example.demofimkf;

import com.example.demofimkf.dao.Userdao;
import com.example.demofimkf.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestApi {

    @Autowired
    private Userdao dao;

    @GetMapping("/rest/user")
    public List<User> getAllUsers()
    {
        return dao.findAll();
    }

    @PostMapping
    @GetMapping("/rest/user")
    public void createUser(@RequestBody User user)
    {
        dao.create(user);
    }
}
