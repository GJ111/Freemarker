package com.example.demo2.Controller;

import com.example.demo2.Entity.User;
import com.example.demo2.UserDao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("test")
    public String print() {
        User userById = userMapper.findUserById(1);
        return userById.toString();

    }
}
