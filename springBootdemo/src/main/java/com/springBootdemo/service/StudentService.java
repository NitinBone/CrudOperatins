package com.springBootdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootdemo.bean.Product;
import com.springBootdemo.bean.Student;
import com.springBootdemo.repository.ProductRepository;
import com.springBootdemo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	public StudentRepository studentRepo;

	public List<Student> getAllStudent() {
		List<Student> students=new ArrayList<>();
		studentRepo.findAll().forEach(students::add);
		return students;
	}

	public void addStudent(Student student) {
		studentRepo.save(student);
	}

	public void updateStudent(Student student) {
		studentRepo.save(student);

	}

	public void deleteStudent(String id) {
		studentRepo.deleteById(id);
	}
	
	
	
	
}
