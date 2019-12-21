package com.zhangju.manage.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangju
 * @version 1.0
 * @since 1.0
 * 2019/12/21 14:59
 **/
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户手机号
     */
    private String userMobile;
    /**
     * 用户状态 NORMAL、FROZEN
     */
    private String userStatus;
    /**
     * 用户角色
     */
    private String userRole;
    /**
     * 用户创建时间
     */
    private Date createTime;
    /**
     * 用户修改时间
     */
    private Date updateTime;
    /**
     * 用户密码
     */
    private String password;


}
