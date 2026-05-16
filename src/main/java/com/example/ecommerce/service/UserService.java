
package com.example.ecommerce.service;

import com.example.ecommerce.entity.User;

public interface UserService {
    void register(User user);
    String login(User user);
}
