package com.legend.reactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ReactiveStringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: RedisController
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/9/5 9:13
 */
@RestController
@RequestMapping(value ="redis")
public class RedisController {

    @Autowired
    private ReactiveStringRedisTemplate reactiveRedisTemplate;

    @GetMapping("redisSubscribe")
    public String redisSubscribe(String key,String value){

        String result = "success" ;
        reactiveRedisTemplate.opsForValue().set(key,value)
                .subscribe(b-> System.out.println(b),c-> System.out.println(c));

        return result;

    }

}
