package com.yt.springbootmybatis;

import com.yt.springbootmybatis.mapper.IndexTestMapper;
import com.yt.springbootmybatis.model.IndexTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Resource
    private IndexTestMapper indexTestMapper;

    @Test
    void contextLoads() {

    }

}
