package com.example.demo1.service;

import com.example.demo1.entity.Announce;

import java.util.List;

/**
  *@author: Heart❤
  *@Time: 2021/4/21  10:33 
  *@purpose:
*/
  
public interface IAnnounceService {


    int deleteByPrimaryKey(Integer announceId);

    int insert(Announce record);

    int insertSelective(Announce record);

    Announce selectByPrimaryKey(Integer announceId);

    int updateByPrimaryKeySelective(Announce record);

    int updateByPrimaryKey(Announce record);

    List<Object> selectAllNotDelete(Boolean type);

}
