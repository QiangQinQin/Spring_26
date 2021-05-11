package com.tulun.service;

import com.tulun.bean.Connection;
import com.tulun.config.Config;

/*
访问数据库的类
 */
public class DataSourceService {
    private Config config;

    public DataSourceService(Config config) {
        this.config = config;
    }

    public Connection getConnection(){
        return new Connection();//模拟来写，连接数据源是datasource本来就有connection连接
    }

}
