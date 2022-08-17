package com.author.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.author.model.AuthorBooks;
import com.author.service.IAuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	IAuthorService authorservice;
	
	@PostMapping("/saveAuthorBook")
	Integer createAuthor(@RequestBody AuthorBooks authorbook) {
		Integer id = authorservice.saveAuthor(authorbook);
		return id;
	}
	
	@GetMapping("/getAllAuthorBooks")
	List<AuthorBooks> getAllBooks(){
		
		return authorservice.getAllAuthorBooks();
	}

	@GetMapping("/getAuthorBookById/{id}")
	public Optional<AuthorBooks>getEmployee(@PathVariable Integer id){
		Optional<AuthorBooks> authorbook =authorservice.getAuthorBookByID(id);
		return authorbook;
	}
	
	
	
	
	
}
