package com.gary.springbootmall.dao;

import com.gary.springbootmall.dto.UserRegisterRequest;
import com.gary.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
