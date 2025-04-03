package com.javaproject.springjdbc.spring_jdbc;

import com.javaproject.springjdbc.spring_jdbc.model.Student;
import com.javaproject.springjdbc.spring_jdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setRollNo(101);
		student.setName("Rohit");
		student.setMarks(99);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student);
		List<Student> students = service.getStudent();
		System.out.println("Students: "+students);
	}
}
