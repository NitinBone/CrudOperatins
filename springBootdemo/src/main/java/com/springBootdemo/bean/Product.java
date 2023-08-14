package com.springBootdemo.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	
	
	@Id
    private String id;
    private String name;
    private String prize;
   
    
    
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product( String Id, String name,String prize) {
		super();
	
		this.id = Id;
		this.name = name;
		this.name= prize;
	
	}


	


	public String getId() {
		return id;
	}


	public void setId(String Id) {
		this.id = Id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPrize() {
		return prize;
	}


	public void setPrize(String prize) {
		this.prize = prize;
	}


	
	
    

}
