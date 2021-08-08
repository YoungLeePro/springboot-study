package com.yt.springbootmybatis.mapper;

import com.yt.springbootmybatis.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @USER: Young
 * @DATETIME: 2021/2/5
 * @DESCRIPTION:
 **/
@Repository
public interface UserMapper {

    User getById(@Param("id")Integer id);

    List<User> list();

    void insert(@Param("user") User user);

    void update(@Param("user") User user);

    void delete(@Param("id") Integer id);
}
