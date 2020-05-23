package com.ansh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public void get() {
        System.out.println(stringRedisTemplate.opsForZSet().rangeByScore("JK", 0, Integer.MAX_VALUE));
    }
}
