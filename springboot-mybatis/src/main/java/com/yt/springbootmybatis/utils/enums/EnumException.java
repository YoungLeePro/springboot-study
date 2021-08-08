package com.yt.springbootmybatis.utils.enums;

import lombok.Getter;

/**
 * @USER: Young
 * @DATETIME: 2021/2/26
 * @DESCRIPTION:
 **/
@Getter
public enum EnumException {
    /**
     * 登录相关
     */
    LOGIN_SUCCESS(200, "登录成功"),
    LOGOUT_SUCCESS(200, "登出成功");

    private Integer code;

    private String message;

    EnumException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
