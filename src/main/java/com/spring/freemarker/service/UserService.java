package com.spring.freemarker.service;

import com.spring.freemarker.entity.User;

public interface UserService {

    User findUserById(Integer id);
}
