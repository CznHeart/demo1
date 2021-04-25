package com.example.demo1.service.serviceImpl;

import com.example.demo1.dao.UserDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo1.entity.User;
import com.example.demo1.service.IUserService;

/**
  *@author: Heart❤
  *@Time: 2021/4/23  14:44 
  *@purpose:
*/
  
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userDao.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) {
        return userDao.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userDao.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userDao.updateByPrimaryKey(record);
    }

}
