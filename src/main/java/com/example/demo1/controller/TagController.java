package com.example.demo1.controller;

import com.example.demo1.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Heart❤
 * @Time: 2021/4/19  18:18
 * @purpose:
 */
@RestController
@ResponseBody
public class TagController {

    @Autowired
    private ITagService itagService;

    @GetMapping("/listTags")
    public Object listTags(){
        return itagService.listTags();
    }

    @GetMapping("/getTagById")
    public Object getTagById(int id){
        return itagService.getTagById(id);
    }

}
