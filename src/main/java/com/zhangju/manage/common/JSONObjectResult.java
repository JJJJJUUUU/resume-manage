package com.zhangju.manage.common;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @author zhangju 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/12/20 9:16
 **/
@Data
public class JSONObjectResult<T> {
    /**
     *返回码
     */
    private int code;

    /**
     *消息
     */
    private String message;

    /**
     *返回数据
     */
    private T data;
}
