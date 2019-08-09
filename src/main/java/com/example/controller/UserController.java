package com.example.controller;

import com.example.bean.ResponseBean;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: whj
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequiresPermissions("user:getAdminMessage")
    @RequestMapping(value = "/getAdminMessage", method = RequestMethod.GET)
    public ResponseBean getAdminMessage() {
        return new ResponseBean(200,"admin",null);
    }

    @RequiresPermissions("user:getGuestMessage")
    @RequestMapping(value = "/getGuestMessage", method = RequestMethod.GET)
    public ResponseBean getGuestMessage() {
        return new ResponseBean(200,"guest",null);
    }
}
