package com.example.demo1.controller;

import com.example.demo1.entity.User;
import com.example.demo1.entity.UserWx;
import com.example.demo1.service.IUserService;
import com.example.demo1.service.IUserWxService;
import com.example.demo1.service.serviceImpl.WxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Heart❤
 * @Time: 2021/4/23  14:07
 * @purpose:
 */
@RestController
public class UserWxController {

    @Autowired
    IUserWxService iUserWxService;

    @Autowired
    WxService wxService;

    @Autowired
    IUserService iUserService;

    @GetMapping("/userWx")
    public Object setUserWx(String code ) throws Exception{

        Map<String, String> map = wxService.login(code);
        String openId = map.get("openid");
        System.out.println(openId);
        UserWx userWx = iUserWxService.selectByOpenId(openId);
        //可能出问题，如果mapper没找到，也许返回一个实体只不过没有数据
        Map<Object,Object> retmap = new HashMap<>();
        if(userWx != null){
            retmap.put("userId",userWx.getUserId());
            retmap.put("user",iUserService.selectByPrimaryKey(userWx.getUserId()));
            return retmap;
        }else{
            userWx = new UserWx();
            userWx.setOpenId(openId);
            iUserWxService.insertSelective(userWx);
            userWx = iUserWxService.selectByOpenId(openId);
            retmap.put("userId",userWx.getUserId());
            return retmap;
        }
    }

    @PostMapping("/addUser")
    public Object addUser(@RequestBody User user){
        System.out.println(user.getUserId());
        System.out.println(user.getAvatarUrl());
        System.out.println(user.getNickName());
        iUserService.insertSelective(user);
        Map<String, String> map = new HashMap<>();
        map.put("userid",String.valueOf(user.getUserId()));
        return map;
    }

}
