package com.book.model;

import javax.persistence.Embeddable;

@Embeddable
public class Pages {
	
	private int pages;

	public Pages(){
		
	}
	public Pages(int pages) {
		super();
		this.pages = pages;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	

}
