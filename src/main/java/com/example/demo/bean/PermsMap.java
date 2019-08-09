package com.example.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: whj
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "permission-config")
public class PermsMap {
    private List<Map<String,String>> perms;

    public List<Map<String, String>> getPerms() {
        return perms;
    }
    public void setPerms(List<Map<String, String>> perms) {
        this.perms = perms;
    }
}
