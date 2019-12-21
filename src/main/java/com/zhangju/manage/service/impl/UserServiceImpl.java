package com.zhangju.manage.service.impl;

import com.zhangju.manage.entity.User;
import com.zhangju.manage.mapper.UserMapper;
import com.zhangju.manage.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangju 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/12/21 15:19
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User userLogin(String userName, String password) {
        return userMapper.getUserByUserNameAndPassword(userName,password);
    }
}
