package com.springBootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springBootdemo.bean.Student;
import com.springBootdemo.service.StudentService;




@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/students")
	public List<Student> getAllProducts()
	{
		return studentservice.getAllStudent();
	}
	@RequestMapping("/students/{id}")
	public List<Student> getStudent(String id)
	{
		return studentservice.getAllStudent();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/students")
	public void addStudent(@RequestBody Student student)
	{
		studentservice.addStudent(student);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/students/{id}")
	public void updateStudent(@PathVariable String id,@RequestBody Student student)
	{
		studentservice.updateStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/students/{id}")
	public void DeleteStudent(@PathVariable String id)
	{
		studentservice.deleteStudent(id);
	}
}
