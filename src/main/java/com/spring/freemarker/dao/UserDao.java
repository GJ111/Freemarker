package com.spring.freemarker.dao;

import com.spring.freemarker.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User findUserById(Integer id);

}
