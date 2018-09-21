package com.xxx.controller;

import com.xxx.base.CacheKeyTypePrefix;
import com.xxx.base.SystemConstant;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BaseController {

	@Autowired
	private RedisTemplate redisTemplate;
	protected org.slf4j.Logger Logger = LoggerFactory.getLogger(BaseController.class);
	

	protected Long getUserId(HttpServletRequest request) {
		String accessToken = request.getHeader(SystemConstant.TOKEN_NAME);
		Long userId = (Long) redisTemplate.opsForValue().get(CacheKeyTypePrefix.LOGIN_TOKEN+accessToken);
		return userId;
	}

	protected String getAccessToken(HttpServletRequest request) {
		String accessToken = request.getHeader(SystemConstant.TOKEN_NAME);
		return accessToken;
	}

}