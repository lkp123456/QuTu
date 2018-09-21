package com.xxx.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Comment {
    private Long id;

    private Long targetId;

    private Long parentId;

    private Long userId;

    private String content;

    private Long replyUserId;

    private Long upCount;

    private Long downCount;

    private Integer deleteStatus;

    private Date createTime;

    private Date updateTime;

}