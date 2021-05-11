package com.tulun;


import com.tulun.bean.Student1;
import com.tulun.bean.StudentMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Iterator;
import java.util.List;

public class JDBCTemplateDemo {
    public static void main(String[] args) {
//        //创建对象，设置 数据源 信息(超时时间不用设置，默认就行)
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/tulun");
//        driverManagerDataSource.setUsername("root");
//        driverManagerDataSource.setPassword("123456");
//        //获取jdbc模板 实例
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource);//可以通过参数传，也可以通过setDataSource传


        //使用xml文件替换上面的连接和获取
        String path="applicationcontext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
//       注意书写，plate  不是 palte
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");


        //通过模板对象调用方法来执行相关操作
        //通过jdbcTemplate提供的 update 方法来完成变更操作（修改、新增、删除）
//        //例：删除操作SQL
//        String deleteSql = "delete from Student where SID = ?";
//        //insert into  Student(SID，Sname) values(?,?)
//        //传参数 []是动态数组，根据{}的元素个数确定数组大小。22是第一个参数，对应上面SID的占位符
////        返回影响行数
//        int update = jdbcTemplate.update(deleteSql, new Object[]{22});

        //查询操作（单个对象） 使用queryForObject方法
        String selectSql1 = "select * from Student where SID = ?";

       // 用RowMapper（完成数据库结果集 和 java对象的映射）优化了JDBC Resultset耦合性大的问题
        //传了一个参数，且值为1，放在Object[]里
        Student1 student1 = jdbcTemplate.queryForObject(selectSql1, new Object[]{1}, new StudentMapper());
        System.out.println(student1);


        //查询操作(多个结果集对象) 使用 query 方法，返回List结果集
        String selectSql2 = "select * from Student";
        List<Student1> student1List = jdbcTemplate.query(selectSql2, new StudentMapper());
        System.out.println(student1List.size());
        Iterator<Student1> iterator = student1List.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}


