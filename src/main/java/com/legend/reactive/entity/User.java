package com.legend.reactive.entity;

/**
 * @title: User
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/9/5 8:57
 */
public class User {

    private String name;
    private String desc;

    public User(){

    }
    public User(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
