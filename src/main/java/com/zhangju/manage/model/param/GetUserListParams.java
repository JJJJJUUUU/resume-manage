package com.zhangju.manage.model.param;

import lombok.Data;

/**
 * @author zhangju 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/12/22 21:24
 **/
@Data
public class GetUserListParams {
    /**
     * 用户名或手机号
     */
    private String userName;

    /**
     * 页码
     */
    private String pageNumber = "1";

    /**
     * 每页大小
     */
    private String pageSize = "10";


}
