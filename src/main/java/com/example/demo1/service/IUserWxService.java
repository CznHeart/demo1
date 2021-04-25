package com.example.demo1.service;

import com.example.demo1.entity.UserWx;
    
/**
  *@author: Heart❤
  *@Time: 2021/4/23  13:54 
  *@purpose:
*/
  
public interface IUserWxService {


    int deleteByPrimaryKey(Integer userId);

    int insert(UserWx record);

    int insertSelective(UserWx record);

    UserWx selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserWx record);

    int updateByPrimaryKey(UserWx record);

    UserWx selectByOpenId(String openId);
}
