package com.tulun.dao;

import com.tulun.bean.Student1;

import java.util.List;//注意不要导错包

public interface Student1Mapper {
    public Student1 selectStudent1ById(Integer id);

    public List<Student1> findAll();
}
