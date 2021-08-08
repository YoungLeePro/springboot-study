package com.yt.springbootmybatis.controller;

import com.yt.springbootmybatis.annotation.PreAuth;
import com.yt.springbootmybatis.model.IndexTest;
import com.yt.springbootmybatis.model.User;
import com.yt.springbootmybatis.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: Young
 * @DATETIME: 2021/2/5
 * @DESCRIPTION:
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("list")
    public List<User> list(){
        return userService.list();
    }

    @RequestMapping("getById/{id}")
    @PreAuth("我是aop实现的注解")
    public User getById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return user;
    }

    @RequestMapping("add")
    public void add(){
        User user = new User();
        user.setName("事务新增第一天");
        user.setAge(28);
        user.setId(8);
        userService.insert(user);
    }

    @RequestMapping("modify")
    public void modify(){
        User user = new User();
        user.setName("第七条");
        user.setAge(29);
        user.setId(7);
        userService.update(user);
    }

    @RequestMapping("delete")
    public void delete(){
        userService.delete(7);
    }

}
