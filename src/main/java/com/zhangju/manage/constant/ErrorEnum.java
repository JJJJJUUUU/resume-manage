package com.zhangju.manage.constant;

/**
 * 错误码枚举类
 * @author zhangju
 * @version 1.0
 * @since 1.0
 * 2019/12/21 17:56
 **/
public enum ErrorEnum {
    /*
     * 请求成功
     */
    OK(0, "请求成功"),
    SYSTEM_ERROR(2000,"系统错误"),
    USER_PASSWORD_ERROR(2001,"用户名密码错误");

    private int code;
    private String message;

    ErrorEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public int getCode() {
        return this.code;
    }


}
