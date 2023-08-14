package com.springBootdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.springBootdemo.bean.Course;

public interface CourseRepository  extends CrudRepository<Course,String>{

	Iterable<Course> findAll();

}
