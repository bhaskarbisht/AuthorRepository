package com.author.service;

import java.util.List;
import java.util.Optional;

import com.author.model.AuthorBooks;

public interface IAuthorService {
	
	Integer saveAuthor(AuthorBooks authorbook);

	public List<AuthorBooks> getAllAuthorBooks();
	
	Optional<AuthorBooks> getAuthorBookByID(Integer id);


}
