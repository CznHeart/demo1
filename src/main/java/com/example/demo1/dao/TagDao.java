package com.example.demo1.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Heart❤
 * @Time: 2021/4/19  18:23
 * @purpose:
 */
@Mapper
public interface TagDao {

    List<Object> listTags();

    Object getTagById(int id);
}
