package com.book.model;

import javax.persistence.Embeddable;



@Embeddable
public class Description {
	
	private String description;
	
	public Description(){
		
	}

	public Description(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
