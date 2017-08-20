package com.book.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Category {
	
	@Id
	private String descriptionCategory;
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category" ,cascade = CascadeType.ALL)
	private List<Book> books = new ArrayList<>();
	
	public Category(){
		
	}
	
	public Category(String description){
		this.descriptionCategory = description;
	}
	
	public Category(String description, List<Book> books ){
		this.descriptionCategory = description;
		this.books = books;
	}


	public String getDescription() {
		return descriptionCategory;
	}

	public void setDescription(String description) {
		this.descriptionCategory = description;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	

}
