package com.gary.springbootmall.service;

import com.gary.springbootmall.dto.UserRegisterRequest;
import com.gary.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
