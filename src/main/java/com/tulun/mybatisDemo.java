package com.tulun;

import com.tulun.bean.Student1;
import com.tulun.dao.Student1Mapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

public class mybatisDemo {
    public static void main(String[] args) {

        String path="spring-mybatis.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
//  利用spring(getBean)获取maybatis（数据库）中对象
        Student1Mapper student1Mapper = (Student1Mapper) applicationContext.getBean("student1Mapper");
//      利用接口的一个对象来调用select方法
//        Student1 student1=student1Mapper.selectStudent1ById(1);
//        System.out.println(student1);
        List<Student1> all = student1Mapper.findAll();
        Iterator<Student1> iterator = all.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
