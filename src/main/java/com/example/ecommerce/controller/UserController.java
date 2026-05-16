
package com.example.ecommerce.controller;

import com.example.ecommerce.common.Result;
import com.example.ecommerce.entity.User;
import com.example.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(@RequestBody User user){
        userService.register(user);
        return Result.success("用户注册成功");
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        return Result.success(userService.login(user));
    }
}
