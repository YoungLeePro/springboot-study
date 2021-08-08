package com.yt.springbootmybatis.service;

import com.yt.springbootmybatis.model.User;

import java.util.List;

/**
 * @USER: Young
 * @DATETIME: 2021/2/5
 * @DESCRIPTION:
 **/
public interface UserService {

    User getById(Integer id);

    List<User> list();

    void insert(User user);

    void update(User user);

    void delete(Integer id);
}
