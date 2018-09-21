package com.xxx.service;

import com.xxx.dao.UserMapper;
import com.xxx.entity.User;
import com.xxx.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/9/18 16:10
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userInfoMapper;



    public User getUserById(long id) {
        User userInfo = userInfoMapper.selectByPrimaryKey(id);
        return userInfo;
    }

    public User getUserByOpenId(String openId) {
        UserExample userInfoExample = new UserExample();
        userInfoExample.createCriteria().andOpenIdEqualTo(openId);
        List<User> userInfos = userInfoMapper.selectByExample(userInfoExample);
        return userInfos.get(0);
    }

    @Transactional
    public Long createUser(User user) {
        long insertId = userInfoMapper.insertSelective(user);
        return insertId;
    }

    @Transactional
    public Long updateUser(User user) {
        long insertId = userInfoMapper.updateByPrimaryKeySelective(user);
        return insertId;
    }
}
