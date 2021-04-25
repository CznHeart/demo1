package com.example.demo1.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo1.dao.UserWxDao;
import com.example.demo1.entity.UserWx;
import com.example.demo1.service.IUserWxService;

/**
  *@author: Heart❤
  *@Time: 2021/4/23  13:54 
  *@purpose:
*/
  
@Service
public class UserWxServiceImpl implements IUserWxService {

    @Resource
    private UserWxDao userWxDao;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userWxDao.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(UserWx record) {
        return userWxDao.insert(record);
    }

    @Override
    public int insertSelective(UserWx record) {
        return userWxDao.insertSelective(record);
    }

    @Override
    public UserWx selectByPrimaryKey(Integer userId) {
        return userWxDao.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserWx record) {
        return userWxDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserWx record) {
        return userWxDao.updateByPrimaryKey(record);
    }

    @Override
    public UserWx selectByOpenId(String openId) {
        return userWxDao.selectByOpenId(openId);
    }
}
