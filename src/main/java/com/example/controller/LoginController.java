package com.example.controller;

import com.example.bean.ResponseBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;


/**
 * @Auther: whj
 * @Description:
 */
@RestController
public class LoginController {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseBean login(String username, String password) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        subject.login(token);
        return new ResponseBean(200,"login success",null);
    }


    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ResponseBean logout() {
        Subject subject = SecurityUtils.getSubject();
        //注销
        subject.logout();
        return new ResponseBean(200,"成功注销！",null);
    }




}
