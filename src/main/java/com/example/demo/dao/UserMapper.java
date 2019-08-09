package com.example.demo.dao;

import com.example.demo.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @Auther: whj
 * @Description:
 */
@Repository
public interface UserMapper {

    public String getPassword(String username);

    public String getRole(String username);

    public UserInfo getUser(String username);

}
