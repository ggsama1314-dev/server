
package com.example.ecommerce.mapper;

import com.example.ecommerce.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("insert into user(username,email,password,phone) values(#{username},#{email},#{password},#{phone})")
    void insert(User user);
}
