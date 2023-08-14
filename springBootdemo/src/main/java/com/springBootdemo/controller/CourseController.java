package com.springBootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springBootdemo.bean.Course;
import com.springBootdemo.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseservice;
	
	@RequestMapping("/courses")
	public List<Course> getAllCourses()
	{
		return courseservice.getAllCourses();
	}
	@RequestMapping("/courses/{id}")
	public List<Course> getCourses(String id)
	{
		return courseservice.getAllCourses();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/courses")
	public void addCourse(@RequestBody Course course)
	{
		courseservice.addCourse(course);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/courses/{id}")
	public void updateCourse(@PathVariable String id,@RequestBody Course course)
	{
		courseservice.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/courses/{id}")
	public void DeleteCourse(@PathVariable String id)
	{
		courseservice.deleteCourse(id);
	}
}
