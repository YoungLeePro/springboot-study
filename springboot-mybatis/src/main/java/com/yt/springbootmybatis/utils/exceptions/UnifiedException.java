package com.yt.springbootmybatis.utils.exceptions;

import com.yt.springbootmybatis.utils.enums.IEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @USER: Young
 * @DATETIME: 2021/2/26
 * @DESCRIPTION:
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class UnifiedException extends RuntimeException {
    private static final long serialVersionUID = -3663785648260762719L;

    private Integer code;

    private String message;

    private IEnum iEnum;

    public UnifiedException(String message) {
        this.message = message;
    }

    public UnifiedException(Integer code, String message, IEnum iEnum) {
        this.code = code;
        this.message = message;
        this.iEnum = iEnum;
    }
}
