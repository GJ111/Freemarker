package com.example.demo2.UserDao;

import com.example.demo2.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper

public interface UserMapper {
    User findUserById(int id);
}
