package com.zhangju.manage.mapper;

import com.zhangju.manage.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhangju 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/12/21 15:30
 **/
public interface UserMapper {

    /**
     * 通过用户名/手机号、密码获取用户
     * @param userName  用户名/手机号
     * @param password  密码
     * @return
     */
    User getUserByUserNameAndPassword(@Param("userName") String userName, @Param("password")String password);
}
