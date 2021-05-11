package com.tulun.service;

import com.tulun.bean.Connection;
import com.tulun.bean.User;
import com.tulun.config.Config;

public class UserService {
//    和BookService一样，需要先new 销毁 dataSourceService，麻烦。改进：用容器管理共享对象
    private Config config = new Config();
    private DataSourceService dataSourceService = new DataSourceService(config) ;

    /*
        获取用户详细信息
    * */
    public User getUserById (Integer id) {
        Connection connection = dataSourceService.getConnection();
        //省略从数据库中来获取数据

        return new User();
    }
}
