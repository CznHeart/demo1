package com.example.demo1.controller;

import com.example.demo1.service.IUserService;
import com.example.demo1.service.serviceImpl.WxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author: Heart❤
 * @Time: 2021/4/21  18:47
 * @purpose:
 */
@RestController
public class WxController {

    @Autowired
    WxService wxService;

    @Autowired
    IUserService iUserService;

    @PostMapping("/Wx")
    public Object login(@RequestBody Map<String,String> fmap) throws Exception {
        String code = fmap.get("code");

        Map<String, String> map = wxService.login(code);
        System.out.println(map.get("openid"));
        String openId = map.get("openid");
//        User user = iUserService.getUserByWxId(openId);
//
//        //session_key暂未处理，不应该返回给小程序
//
//        if(user != null){
//            map.remove("openid");
//            map.put("userId",String.valueOf( user.getUserId() ));
//            return map;
//        }else{
//            user = new User();
//            user.setOpenId(openId);
//            //如果这个位置直接就可以返回userId，就能简化下面的步骤
//            iUserService.addUser(user);
//            System.out.println(user);
//            user = iUserService.getUserByWxId(openId);
//            map.remove("openid");
//            map.put("userId",String.valueOf( user.getUserId() ));
//            return map;
//        }
        return  null;
    }
}
