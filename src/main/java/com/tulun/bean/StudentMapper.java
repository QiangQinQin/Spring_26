package com.tulun.bean;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student1> {
    /**
     * jdbc模板能够完成自动映射为Java对象关键点在于:手动实现RowMapper接口,即实现mapRow 方法（重要参数有：
     *   ResultSet：数据库结果集
     *   int：(第几条数据) 类似 数据库数据序号，从 0 开始
     *         (对数据库每一条数据i都通过resultSet的get拿；
     *         能进来mapRow就说明有数据，不用像JDBC先判断数据是否为空；
     *         单个对象、多个对象都会进入到这个方法，不过是次数多少问题（二者的唯一区别，其他都一样）)
     *   返回类型：指定的Java对象
     * 该方法主要是完成ResultSet结果集手动映射为Java对象
     */
    @Override
       public Student1 mapRow(ResultSet resultSet, int i) throws SQLException {
        Student1 student1 = new Student1();
        student1.setSID(resultSet.getInt("SID"));
        student1.setSage(resultSet.getInt("Sage"));
        student1.setSname(resultSet.getString("Sname"));
        student1.setSsex(resultSet.getString("Ssex"));
        return student1;
    }
}