package com.tulun.bean;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

//是单例模式
//@Component("user")//注解中user  等价于 applicationcontext.XML配置形式中bean里的  id属性
public class User {
    @Value("3")
    private Integer id;
    @Value("基础班3")
    private String name;
    @Resource(name="book") //bean里的id
    private Book book;//依赖

//  注入集合类型
    private Map<String ,String> map; //map 类型属性
    //1、数组类型属性
    private String[] courses;

    //2、list集合类型属性
    private List<String> list;
    //4、set集合类型属性
    private Set<String> sets;

//有参构造函数   new User(12,"zhangsan")

    public User(Integer id, String name, Book book) {
        this.id = id;
        this.name = name;
        this.book = book;
    }
//setter方法注入
    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String[] getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", book=" + book +
                ", map=" + map +
                ", courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", sets=" + sets +
                '}';
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    //    如果指定了有参构造函数，（就不会生成默认的无参构造函数，xml里通过  无参 构造函数实例化就会报错），
    public User() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
