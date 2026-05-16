
package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.User;
import com.example.ecommerce.mapper.UserMapper;
import com.example.ecommerce.service.UserService;
import com.example.ecommerce.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user) {
        userMapper.insert(user);
    }

    @Override
    public String login(User user) {
        return TokenUtils.createToken(user.getUsername());
    }
}
