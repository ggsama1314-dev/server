
package com.example.ecommerce.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class User {
    private Long userId;
    private String username;
    private String email;
    private String password;
    private String phone;
    private LocalDateTime createTime;
}
