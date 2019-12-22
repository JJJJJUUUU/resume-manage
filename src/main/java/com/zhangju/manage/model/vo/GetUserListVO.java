package com.zhangju.manage.model.vo;

import com.zhangju.manage.entity.User;
import lombok.Data;

import java.util.List;

/**
 * @author zhangju 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/12/22 22:55
 **/
@Data
public class GetUserListVO {

    /**
     * 用户信息列表
     */
    private List<User> list;

    /**
     * 分页信息
     */
    private PageVO page;


}
