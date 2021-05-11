package com.tulun.factory;

import com.tulun.bean.User;
//静态工厂类
public class StaticFactory {
    public static User getUser() {
        return new User();
    }

//    public static void main(String[] args) {
//        User user = StaticFactory.getUser();//之前通过工厂来拿对象的方法，现在交给容器管理
//    }
}
