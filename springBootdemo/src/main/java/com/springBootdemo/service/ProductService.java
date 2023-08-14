package com.springBootdemo.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootdemo.bean.Product;
import com.springBootdemo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	public ProductRepository productRepo;
	
	public List<Product> getAllProducts()
	{
		List<Product> products=new ArrayList<>();
		productRepo.findAll().forEach(products::add);
		return products;
	}

	public void addProduct(Product product) {
		productRepo.save(product);
	}

	
	public void updateProduct(Product product) {
	     productRepo.save(product);
		
	}

	public void deleteProduct(String id) {

		productRepo.deleteById(id);
	}

	
	
}
