package com.example.demo1.dao;

import com.example.demo1.entity.UserWx;
import org.apache.ibatis.annotations.Mapper;


/**
  *@author: Heart❤
  *@Time: 2021/4/23  13:54 
  *@purpose:
*/
  
@Mapper
public interface UserWxDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserWx record);

    int insertSelective(UserWx record);

    UserWx selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserWx record);

    int updateByPrimaryKey(UserWx record);

    UserWx selectByOpenId(String openId);
}