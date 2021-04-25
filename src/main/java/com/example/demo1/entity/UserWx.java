package com.example.demo1.entity;

import java.io.Serializable;
import lombok.Data;


/**
 * @author: Heart❤
 * @Time: 2021/4/23  13:54
 * @purpose:
 */

@Data
public class UserWx implements Serializable {
    private Integer userId;

    private String openId;

    private static final long serialVersionUID = 1L;
}