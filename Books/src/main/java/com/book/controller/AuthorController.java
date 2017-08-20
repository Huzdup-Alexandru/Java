package com.book.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.book.model.Author;
import com.book.service.AuthorService;
import com.book.service.AuthorServiceImpl;

@RestController
@RequestMapping(value ="/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService = new AuthorServiceImpl();
	
	@RequestMapping(value ="/add" ,method = RequestMethod.POST)
	public void addAuthor(@RequestBody Author author){
		authorService.addAuthor(author);
		
	}
	@RequestMapping(value = "/getAll")
	public List<Author> getAll(){
		return authorService.getAllAuthors();
		
	}
	
	@RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE)
	public void removeAuthor(@PathVariable String name){
		authorService.deleteAuthor(name);
	}
	
	@RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
	public Author getAuthor(@PathVariable String name){
		return authorService.getAuthorByName(name);
	}
	
	
	@RequestMapping(value = "/edit/{name}", method = RequestMethod.PUT)
	public void updateAuthor(@RequestBody Author author,@PathVariable String name){
		authorService.editAuthor(author,name);
	}
}
