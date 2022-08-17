package com.author.service;

import java.util.List;
import java.util.Optional;

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
	@Override
	public List<AuthorBooks> getAllAuthorBooks() {
		return authorrepo.findAll();
	}
	@Override
	public Optional<AuthorBooks> getAuthorBookByID(Integer id) {
		// TODO Auto-generated method stub
		return authorrepo.findById(id);
	}

}
