package com.yt.springbootmybatis.utils.enums;

public interface IEnum {

    /**
     * 编码
     * 0失败
     * 1成功
     * @return
     */
    Integer code();

    /**
     * 成功信息
     * @return
     */
    String message();
}
