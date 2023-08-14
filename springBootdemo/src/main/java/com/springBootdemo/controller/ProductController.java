package com.springBootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springBootdemo.bean.Product;
import com.springBootdemo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@RequestMapping("/products")
	public List<Product> getAllProducts()
	{
		return productservice.getAllProducts();
	}
	@RequestMapping("/products/{id}")
	public List<Product> getProducts(String id)
	{
		return productservice.getAllProducts();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/products")
	public void addProduct(@RequestBody Product product)
	{
		productservice.addProduct(product);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/products/{id}")
	public void updateProduct(@PathVariable String id,@RequestBody Product product)
	{
		productservice.updateProduct(product);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/products/{id}")
	public void DeleteProduct(@PathVariable String id)
	{
		productservice.deleteProduct(id);
	}
	}
