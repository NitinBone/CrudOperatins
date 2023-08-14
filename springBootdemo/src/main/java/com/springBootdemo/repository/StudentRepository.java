package com.springBootdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.springBootdemo.bean.Product;
import com.springBootdemo.bean.Student;

public interface StudentRepository extends CrudRepository<Student,String>{
	
	Iterable<Student> findAll();

}
