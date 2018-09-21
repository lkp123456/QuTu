package com.xxx.controller.pic;

import com.xxx.base.RequestURI;
import com.xxx.base.ResponseResult;
import com.xxx.controller.BaseController;
import com.xxx.service.PicService;
import com.xxx.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@PropertySource("classpath:properties/externalservice.properties")
public class PicController extends BaseController {

    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    private PicService picService;

    @Value("${appId}")
    private String appId;

    @Value("${appSecret}")
    private String appSecret;


    @RequestMapping(RequestURI.UPYUN_BASE + "/savePicInfo")
    public ResponseResult savePicInfo(@RequestParam String pic_url, @RequestParam String md5, @RequestParam String tagList, @RequestParam String pic_desc) {
        boolean flag = picService.createPic(pic_url, md5, tagList, pic_desc);
        if(!flag){
            return ResponseResult.ERROR;
        }
        return ResponseResult.OK;
    }

    @RequestMapping(RequestURI.USER_BASE+ "/updateAddOrDownCount")
    public ResponseResult savePicInfo(@RequestParam String action) {
        picService.updateAddOrDownCount(action);
        return ResponseResult.OK;
    }


}
