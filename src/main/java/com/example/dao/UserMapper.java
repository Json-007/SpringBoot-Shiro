package com.example.dao;

import com.example.entity.UserInfo;
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
