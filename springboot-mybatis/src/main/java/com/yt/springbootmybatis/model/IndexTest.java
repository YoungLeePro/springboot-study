package com.yt.springbootmybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @USER: Young
 * @DATETIME: 2021/2/27
 * @DESCRIPTION:
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndexTest {
    private Long id;
    private String name;
    private String descr;
    private Long num;
}
