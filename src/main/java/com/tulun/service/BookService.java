package com.tulun.service;

import com.tulun.config.Config;

public class BookService {
    private Config config = new Config();
    private DataSourceService dataSourceService = new DataSourceService(config) ;
    /*
    获取书籍详细信息
    * */


//    public Book getBookById (Integer id) {
//        /*从数据库中来获取数据
//         */
//        Connection connection = dataSourceService.getConnection();
//        //省略
//
//        return new Book();
//    }
}
