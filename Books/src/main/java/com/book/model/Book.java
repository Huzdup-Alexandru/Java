package com.book.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="Book")
public class Book {

	@Id
	private long isbn;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	private Author name;
	
	@NotNull
	private String title;
	
	@NotNull
	private Type type;
	
	@NotNull
	private Status status;
	
	@NotNull
	private Description description;
	
	@NotNull
	private Pages pages;
	
	
	
	public Book(){
		
	}
	public Book(long isbn, String authorName, String title, Type type,Status status,Description description,Pages pages) {
		super();
		this.isbn = isbn;
		this.name.setName(authorName);
		this.title = title;
		this.type = type;
		this.status = status;
		this.description = description;
		this.pages = pages;
	}
	
	
	

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Pages getPages() {
		return pages;
	}

	public void setPages(Pages pages) {
		this.pages = pages;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}


	public Author getAuthorName() {
		return name;
	}


	public void setAuthorName(Author authorName) {
		this.name = authorName;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}

	
	
	

}
