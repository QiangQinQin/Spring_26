package com.tulun.service;

import com.tulun.bean.User;

//购买操作
public class BuyService {
    //   某个用户购买某本书
    private UserService userService = new UserService();
    private BookService bookService = new BookService();

    public void buyBook(Integer uid, Integer bookId) {
//先获取每个人信息
        User user = userService.getUserById(uid);
//获取图书信息
//        Book book = bookService.getBookById(bookId);
//往数据库记录购买信息
    }
}
