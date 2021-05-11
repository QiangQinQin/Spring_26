package com.tulun.bean;

import org.springframework.beans.factory.annotation.Value;

//@Component("book")
public class Book {
    @Value("4")
    private Integer id;
    @Value("书名")
    private String name;
    @Value("描述")
    private String desc;//描述

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Book() {
    }


}
