package com.example.demo1.entity;

import java.io.Serializable;
import lombok.Data;


/**
 * @author: Heart❤
 * @Time: 2021/4/23  14:44
 * @purpose:
 */

@Data
public class User implements Serializable {
    /**
     * id（主键)
     */
    private Integer userId;

    private String nickName;

    private String avatarUrl;

    private String contact;

    private static final long serialVersionUID = 1L;
}