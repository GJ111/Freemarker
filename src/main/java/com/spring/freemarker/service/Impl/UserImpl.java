package com.spring.freemarker.service.Impl;

import com.spring.freemarker.dao.UserDao;
import com.spring.freemarker.entity.User;
import com.spring.freemarker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(Integer id) {
        System.out.println("ok");
        User user = userDao.findUserById(1);
        return user;
    }
}
