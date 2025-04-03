package com.javaproject.springjdbc.spring_jdbc.repository;

import com.javaproject.springjdbc.spring_jdbc.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepository {
    public void save(Student student){
        System.out.println("Student Added Successfully");
    }

    public List<Student> findAll(){
        return new ArrayList<>();
    }
}
