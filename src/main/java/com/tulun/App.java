package com.tulun;

import com.tulun.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        //获取IOC容器,通过读取classpath路径下的spring的配置文件
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
//        //在IOC容器获取需要的对象实例  name就是applicationcontext里面的id
////        User user = (User) applicationContext.getBean("user");//不需要new，只是获取使用权
//        User user1 = (User) applicationContext.getBean("user1");//静态工厂获取
//        User user2 = (User) applicationContext.getBean("user2");//普通工厂获取

//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");//注解形式获取
//        User user3 = (User) applicationContext.getBean("user");

//依赖注入
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");//注解形式获取
//        User user3 = (User) applicationContext.getBean("user3");

//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");//注解形式获取
//        User user4 = (User) applicationContext.getBean("user5");

//        //测试@value
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");//注解形式获取
//        User user3 = (User) applicationContext.getBean("user");
//
//        System.out.println(user3);
//        //        ApplicationContext

        //获取IOC容器,通过读取classpath路径下的spring的配置文件
        String path = "springaop.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        //在IOC容器获取需要的对象实例
        Student student = (Student) applicationContext.getBean("student");
        student.addStudent();
    }
}
