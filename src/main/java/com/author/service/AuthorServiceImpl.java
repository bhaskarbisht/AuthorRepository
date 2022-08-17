package com.author.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.model.AuthorBooks;

@Service
public class AuthorServiceImpl implements IAuthorService {

	@Autowired
	IAuthorRepository authorrepo;
	@Override
	public Integer saveAuthor(AuthorBooks authorbook) {
		AuthorBooks savedAuthor = authorrepo.save(authorbook);

		return savedAuthor.getId();
	}

}
