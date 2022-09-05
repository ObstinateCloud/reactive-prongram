package com.legend.reactive.controller;

import com.legend.reactive.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @title: WebFluxController
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/9/5 8:59
 */
@RestController
public class WebFluxController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello,WebFlux!";
    }

    @GetMapping("/user")
    public Mono<User> getUser(){
        User user = new User();
        user.setName("LCZ");
        user.setDesc("LCZ的Java自习室！！！");
        return Mono.just(user);
    }

}
