package com.springBootdemo.repository;

import javax.security.auth.Subject;

import org.springframework.data.repository.CrudRepository;

import com.springBootdemo.bean.Product;

public interface ProductRepository  extends CrudRepository<Product,String>{

	Iterable<Product> findAll();

}
