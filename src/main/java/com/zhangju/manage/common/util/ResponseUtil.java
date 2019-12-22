package com.zhangju.manage.common.util;

import com.zhangju.manage.common.JSONObjectResult;
import com.zhangju.manage.constant.ErrorEnum;

public class ResponseUtil {
    public static <T> JSONObjectResult<T> success(T data) {
        JSONObjectResult<T> response = new JSONObjectResult<T>();
        response.setCode(ErrorEnum.OK.getCode());
        response.setMessage(ErrorEnum.OK.getMessage());
        response.setData(data);
        return response;
    }
    public static <T> JSONObjectResult<T> error(Integer code,String message,T data) {
        JSONObjectResult<T> response = new JSONObjectResult<T>();
        response.setCode(code);
        response.setMessage(message);
        response.setData(data);
        return response;
    }


    public static <T> JSONObjectResult<T> systemError(T data) {
        JSONObjectResult<T> response = new JSONObjectResult<T>();
        response.setCode(ErrorEnum.SYSTEM_ERROR.getCode());
        response.setMessage(ErrorEnum.SYSTEM_ERROR.getMessage());
        response.setData(data);
        return response;
    }

}
