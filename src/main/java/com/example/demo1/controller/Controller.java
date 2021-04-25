package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Heart❤
 * @Time: 2021/4/18  21:06
 * @purpose:
 */

@RestController
public class Controller {


    @GetMapping("/Hello")
    public String hello(){
        return "hello";
    }

}
