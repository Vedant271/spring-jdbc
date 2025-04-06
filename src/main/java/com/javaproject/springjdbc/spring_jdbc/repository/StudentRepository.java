package com.javaproject.springjdbc.spring_jdbc.repository;

import com.javaproject.springjdbc.spring_jdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepository {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student){
        String sql = "insert into student(rollno, name, marks) values(?,?,?)";
        int rows = jdbcTemplate.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println(rows+" affected");
    }

    public List<Student> findAll(){
        return new ArrayList<>();
    }
}
