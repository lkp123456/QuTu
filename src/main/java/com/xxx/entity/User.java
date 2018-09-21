package com.xxx.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;

    private String openId;

    private String unionId;

    private String nickName;

    private String avatarUrl;

    private Integer gender;

    private String country;

    private String province;

    private String city;

    private String language;

    private Date createTime;

    private Date updateTime;


}