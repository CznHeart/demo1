package com.example.demo1.controller;

import com.example.demo1.entity.Announce;
import com.example.demo1.service.IAnnounceService;
import com.example.demo1.service.serviceImpl.AnnounceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Heart❤
 * @Time: 2021/4/21  10:38
 * @purpose:
 */
@RestController
public class AnnounceController {

    @Autowired
    IAnnounceService iAnnounceService;

    @GetMapping("/selectAnnounce")
    public Object selectAnnounce(Integer id){
        return iAnnounceService.selectByPrimaryKey(id);
    }

    @GetMapping("/deleteById")
    public int deleteById(int id){
        return iAnnounceService.deleteByPrimaryKey(id);
    }

    @GetMapping("/insert")
    public int addAnnounce(Announce announce){
        return iAnnounceService.insertSelective(announce);
    }

    @GetMapping("/update")
    public int updateAnnounce(Announce announce){
        return iAnnounceService.updateByPrimaryKeySelective(announce);
    }

    @GetMapping("/getAllAnnounceNotDelete")
    public Object getAllAnnounce(Boolean type){
        return iAnnounceService.selectAllNotDelete(type);
    }


}
