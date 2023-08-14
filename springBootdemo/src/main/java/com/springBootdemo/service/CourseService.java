package com.springBootdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootdemo.bean.Course;
import com.springBootdemo.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	public CourseRepository courseRepo;
	
	public List<Course> getAllCourses()
	{
		List<Course> corses=new ArrayList<>();
		courseRepo.findAll().forEach(corses::add);
		return corses;
	}

	public void addCourse(Course course) {
		courseRepo.save(course);
	}

	
	public void updateCourse(Course course) {
		courseRepo.save(course);
		
	}

	public void deleteCourse(String id) {

		courseRepo.deleteById(id);
	}

	
}
