package com.xxx.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Pic {
    private Long id;

    private Long userId;

    private String picDesc;

    private String originUrl;

    private String thumbnailUrl;

    private String watermarkUrl;

    private String originMd5;

    private String thumbnailMd5;

    private String watermarkMd5;

    private Long upCount;

    private Long downCount;

    private String tagList;

    private Integer deleteStatus;

    private Date createTime;

    private Date updateTime;


}