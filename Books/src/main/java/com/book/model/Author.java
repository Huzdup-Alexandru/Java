package com.book.model;



import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Author")
public class Author{
	
	@Id
	private String name;

	public Author(){
	}

	public Author(String name) {
		super();
		this.name = name;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
