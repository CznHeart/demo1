package com.example.demo1.dao;

import com.example.demo1.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
  *@author: Heart❤
  *@Time: 2021/4/23  14:40 
  *@purpose:
*/
  
@Mapper
public interface UserDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}