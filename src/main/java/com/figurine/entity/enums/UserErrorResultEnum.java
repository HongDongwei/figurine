package com.figurine.entity.enums;

public enum UserErrorResultEnum {

    DEFAULT_FAIL("1001","处理失败"),
    USER_PASSWORD_NUM("1003","密码位数必须在8-16位之间"),
    USER_PASSWORD_ERROR("1004","用户名或密码错误"),
    USER_USERNAME_NO_PRESENCE("1005","用户名不存在"),
    USER_INFO_NULL("1006","资料不得为空"),
    USER_USERNAME_NULL("1007","用户名不得为空"),
    USER_PASSWORD_NULL("1008","密码不能为空"),
    USER_PRESENCE("1002","用户已存在");

    /**
     * 返回代码
     */
    private String code;
    /**
     * 返回信息
     */
    private String message;


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    UserErrorResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
