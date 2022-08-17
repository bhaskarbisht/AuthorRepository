package com.author.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

}
