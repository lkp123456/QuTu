package com.xxx.controller.user;

import com.alibaba.fastjson.JSON;
import com.xxx.base.CacheKeyTypePrefix;
import com.xxx.base.RequestURI;
import com.xxx.base.ResponseResult;
import com.xxx.controller.BaseController;
import com.xxx.entity.User;
import com.xxx.service.UserService;
import com.xxx.utils.HttpClientFactory;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

@RestController
@Slf4j
@PropertySource("classpath:properties/externalservice.properties")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Value("${jscode2sessionURL}")
    private String jscode2sessionURL;

    @Value("${appId}")
    private String appId;

    @Value("${appSecret}")
    private String appSecret;



    /**
     * @param code 临时登录凭证
     *             登录由wx.checkSessionKey校验SessionKey是否过期 如果过期，调用登录接口 重新获取SessionKey
     * @return
     */
    @RequestMapping(RequestURI.USER_BASE + "/wxlogin")
    public ResponseResult wxlogin(@RequestParam String code) {
        if(StringUtils.isBlank(code)){
            return ResponseResult.INVALID_ARGUMENT;
        }
        HttpClientFactory httpClientFactory = HttpClientFactory.getInstance();
        String responseData = httpClientFactory.postData(jscode2sessionURL + "?appId=" + appId + "&secret=" + appSecret + "&js_code=" + code + "&grant_type=authorization_code", "");
        Map map = JSON.parseObject(responseData, Map.class);
        if(map.containsKey("errcode")){
            log.error("code2sessionURL Error,responseData={}",responseData);
            return ResponseResult.ERROR;
        }
        String unionid = map.containsKey("unionid")?(String) map.get("unionid"):"";
        String session_key = map.containsKey("session_key")?(String) map.get("session_key"):"";
        String openid = map.containsKey("openid")?(String) map.get("openid"):"";

        User user = userService.getUserByOpenId(openid);
        if(user == null){
            user = new User();
            user.setOpenId(openid);
            user.setUnionId(unionid);
            userService.createUser(user);
        }
        //存储SESSION_KEY 供签名验签使用
        redisTemplate.boundValueOps(CacheKeyTypePrefix.SESSION_KEY+openid).set(session_key);
        //添加Login Token
        String authToken = UUID.randomUUID().toString();
        redisTemplate.boundValueOps(CacheKeyTypePrefix.LOGIN_TOKEN+authToken).set(user.getId()+"");
        return ResponseResult.data("OK", authToken);
    }

    @RequestMapping(RequestURI.USER_BASE + "/saveUserInfo")
    public ResponseResult saveUserInfo(@RequestHeader(name ="authToken",required = true) String authToken, String nickName, int gender, String city, String province, String country, String avatarUrl) {
        Long userId = Long.parseLong(redisTemplate.boundValueOps(CacheKeyTypePrefix.LOGIN_TOKEN + authToken).get());
        User userInfo = new User();
        userInfo.setId(userId);
        userInfo.setNickName(nickName);
        userInfo.setGender(gender);
        userInfo.setCity(city);
        userInfo.setProvince(province);
        userInfo.setCountry(country);
        userInfo.setAvatarUrl(avatarUrl);
        userService.updateUser(userInfo);
        return ResponseResult.OK;
    }



}
