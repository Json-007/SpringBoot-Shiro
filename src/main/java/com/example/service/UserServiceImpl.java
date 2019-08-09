package com.example.service;

import com.example.dao.UserMapper;
import com.example.entity.UserInfo;
import org.springframework.stereotype.Service;

/**
 * @Auther: whj
 * @Description:
 */
@Service
public class UserServiceImpl implements UserMapper {
    @Override
    public String getPassword(String username) {
        String pass = null;
        if("admin".equals(username)){
            pass = "111";
        }else if("guest".equals(username)){
            pass = "222";
        }
        return pass;
    }

    @Override
    public String getRole(String username) {
        String role = null;
        if("admin".equals(username)){
            role = "admin";
        }else{
            role = "guest";
        }
        return role;
    }

    @Override
    public UserInfo getUser(String username) {
        UserInfo user = new UserInfo();
        if("admin".equals(username)){
            user.setId("1");
            user.setUsername("admin");
            user.setPassword("111");
            user.setRole("admin");
        }else if("guest".equals(username)){
            user.setId("2");
            user.setUsername("guest");
            user.setPassword("222");
            user.setRole("guest");
        }
        return user;
    }
}
