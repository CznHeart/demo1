package com.example.demo1.service;

import com.example.demo1.entity.User;
    
/**
  *@author: Heart❤
  *@Time: 2021/4/23  14:44 
  *@purpose:
*/
  
public interface IUserService {


    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
