package com.zhangju.manage.service;

import com.zhangju.manage.entity.User;

/**
 * @author zhangju 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/12/21 15:18
 **/
public interface UserService {
    /**
     * 用户登录
     * @param userName 用户名或手机号
     * @param password 密码
     * @return 用户对象
     */
    User userLogin(String userName, String password);
}
