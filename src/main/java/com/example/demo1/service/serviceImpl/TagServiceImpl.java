package com.example.demo1.service.serviceImpl;

import com.example.demo1.dao.TagDao;
import com.example.demo1.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Heart❤
 * @Time: 2021/4/19  18:21
 * @purpose:
 */
@Service
public class TagServiceImpl implements ITagService {

    @Autowired
    private TagDao tagDao;

    @Override
    public List<Object> listTags() {
        return tagDao.listTags();
    }

    @Override
    public Object getTagById(int id) {
        return tagDao.getTagById(id);
    }
}
