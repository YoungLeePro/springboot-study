package com.yt.springbootmybatis.mapper;

import com.yt.springbootmybatis.model.IndexTest;
import org.apache.ibatis.annotations.Param;

public interface IndexTestMapper {
    void insert(@Param("indexTest")IndexTest indexTest);
}
