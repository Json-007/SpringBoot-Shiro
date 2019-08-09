package com.example.service;

import com.example.entity.Resource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Auther: whj
 * @Description:
 */
@Service
public class ResourceServiceImpl {

    public Set<String> getRightsUrl(String role) {
        Set<String> rightUrl = new HashSet<>();

        if("admin".equals(role)){
            //①拦截资源访问路径方式
//            rightUrl.add("/user/getAdminMessage");
            //②注解方式，与@RequiresPermissions的值对应
            rightUrl.add("user:getAdminMessage");
        }else if("guest".equals(role)) {
            //①拦截资源访问路径方式
//            rightUrl.add("/user/getGuestMessage");
            //②注解方式，与@RequiresPermissions的值对应
            rightUrl.add("user:getGuestMessage");
        }
        return rightUrl;
    }

    public List<Resource> queryAll() {
        List<Resource> resourceList = new ArrayList<Resource>();
        Resource resource = new Resource();
        resource.setId(1);
        resource.setResName("获取admin信息");
        resource.setResUrl("/user/getAdminMessage");
        resourceList.add(resource);
        resource = new Resource();
        resource.setId(2);
        resource.setResName("获取guest信息");
        resource.setResUrl("/user/getGuestMessage");
        resourceList.add(resource);
        return resourceList;
    }

}
