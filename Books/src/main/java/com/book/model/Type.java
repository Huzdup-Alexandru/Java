package com.book.model;

import javax.persistence.Embeddable;

@Embeddable
public class Type {

	private String type;
	
	public Type(){
		
	}

	public Type(String type){
		this.type = type;
	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
