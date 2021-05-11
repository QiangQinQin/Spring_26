package com.tulun.factory;

import com.tulun.bean.User;
//普通工厂
//需要new的对象即为要交给容器管理的对象
public class CommonFactory {
    public User getUser(){
        return new User();// 1
    }

//    public static void main(String[] args) {
//        CommonFactory commonFactory = new CommonFactory();//  2
//        User user = commonFactory.getUser();
//    }
}
