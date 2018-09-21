package com.xxx.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Collect {
    private Long id;

    private Long userId;

    private Long picId;

    private Integer deleteStatus;

    private Date createTime;

    private Date deleteTime;

}