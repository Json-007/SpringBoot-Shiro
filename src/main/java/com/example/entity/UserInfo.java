package com.example.entity;

import java.io.Serializable;

/**
 * @Auther: whj
 * @Description:
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -4619596515808443958L;

    private String id;
    private String username;
    private String password;
    private String role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
