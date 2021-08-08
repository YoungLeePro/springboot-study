package com.yt.springbootmybatis.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @USER: Young
 * @DATETIME: 2021/2/5
 * @DESCRIPTION:
 **/
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
}
