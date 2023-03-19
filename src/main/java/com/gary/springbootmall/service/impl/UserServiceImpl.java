package com.gary.springbootmall.service.impl;

import com.gary.springbootmall.dao.UserDao;
import com.gary.springbootmall.dto.UserRegisterRequest;
import com.gary.springbootmall.model.User;
import com.gary.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
