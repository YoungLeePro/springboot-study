package com.yt.springbootmybatis.service.impl;

import com.yt.springbootmybatis.mapper.UserMapper;
import com.yt.springbootmybatis.model.User;
import com.yt.springbootmybatis.service.UserService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @USER: Young
 * @DATETIME: 2021/2/5
 * @DESCRIPTION:
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public User getById(Integer id) {
        User user = userMapper.getById(id);

        if (user != null) {
            redisTemplate.opsForValue().set("hhh", user, 10, TimeUnit.SECONDS);

            Map<String, String> map = new HashMap<>();
            map.put("hash", "hash存的是map?");
            map.put("使用put方法", "hash好啊");
            redisTemplate.opsForHash().putAll("hah",map);

            redisTemplate.opsForList().range("list",0,-1);

            redisTemplate.opsForZSet().add("zset1","zset-1",1.0);

            String[] strArrays = new String[]{"starr1","starr2"};
            redisTemplate.opsForSet().add("setTest", strArrays);
        }
        return user;
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Transactional
    @Override
    public void insert(User user) {
        userMapper.insert(user);
        // 吃掉了，事务失效了
        try {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Transactional
    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }
}
