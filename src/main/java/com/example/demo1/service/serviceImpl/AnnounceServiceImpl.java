package com.example.demo1.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo1.dao.AnnounceDao;
import com.example.demo1.entity.Announce;
import com.example.demo1.service.IAnnounceService;

import java.util.List;

/**
  *@author: Heart❤
  *@Time: 2021/4/21  10:33 
  *@purpose:
*/
  
@Service
public class AnnounceServiceImpl implements IAnnounceService {

    @Resource
    private AnnounceDao announceDao;

    @Override
    public int deleteByPrimaryKey(Integer announceId) {
        return announceDao.deleteByPrimaryKey(announceId);
    }

    @Override
    public int insert(Announce record) {
        return announceDao.insert(record);
    }

    @Override
    public int insertSelective(Announce record) {
        return announceDao.insertSelective(record);
    }

    @Override
    public Announce selectByPrimaryKey(Integer announceId) {
        return announceDao.selectByPrimaryKey(announceId);
    }

    @Override
    public int updateByPrimaryKeySelective(Announce record) {
        return announceDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Announce record) {
        return announceDao.updateByPrimaryKey(record);
    }

    @Override
    public List<Object> selectAllNotDelete(Boolean type) {
        return announceDao.selectAllNotDelete(type);
    }

}
