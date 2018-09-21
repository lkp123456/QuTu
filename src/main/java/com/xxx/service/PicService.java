package com.xxx.service;

import com.xxx.dao.PicMapper;
import com.xxx.entity.Pic;
import com.xxx.entity.PicExample;
import com.xxx.utils.DateTimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/9/18 16:10
 * @Description:
 */
@Service
public class PicService {

    @Autowired
    private PicMapper picMapper;


    public Pic getPicById(long id) {
        Pic pic = picMapper.selectByPrimaryKey(id);
        return pic;
    }

    public List<Pic> getPicByUserId(long userId) {
        PicExample picExample = new PicExample();
        picExample.createCriteria().andUserIdEqualTo(userId);
        List<Pic> pics = picMapper.selectByExample(picExample);
        return pics;
    }

    @Transactional
    public boolean createPic(String pic_url, String md5, String tagList, String pic_desc) {
        Pic pic = new Pic();
        pic.setCreateTime(new Date());
        pic.setOriginMd5(md5);
        pic.setPicDesc(pic_desc);
        pic.setOriginUrl(pic_url);
        pic.setTagList(tagList);
        picMapper.insertSelective(pic);
        return true;
    }

    @Transactional
    public boolean updateAddOrDownCount(String action) {
        //String addUpCount,String cancelAddUpCount,String addDownCount,String cancelAddDownCount
        HashMap<Object, Object> map = new HashMap<>();
        map.put("updateTime", DateTimeUtil.getNowTimeNormalString());
        switch (action) {
            case "addUpCount":
                map.put("addUpCount", "x");
                break;
            case "cancelAddUpCount":
                map.put("cancelAddUpCount", "x");
                break;
            case "addDownCount":
                map.put("addDownCount", "x");
                break;
            case "cancelAddDownCount":
                map.put("cancelAddDownCount", "x");
                break;
        }
        picMapper.updateCountByExample(map);
        return true;
    }
}
