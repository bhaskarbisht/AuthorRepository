package com.author.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.author.model.AuthorBooks;

public interface IAuthorRepository extends JpaRepository<AuthorBooks, Integer> {

}
