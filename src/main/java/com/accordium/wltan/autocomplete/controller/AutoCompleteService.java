package com.accordium.wltan.autocomplete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.accordium.wltan.autocomplete.model.BookList;
import com.accordium.wltan.autocomplete.repository.AutoCompleteRepository;

@Component
@Order(20)
public class AutoCompleteService {

	@Autowired
	private AutoCompleteRepository repo;

	public List<BookList> findAllBookList() {
		return (List<BookList>) repo.findAll();
	}
	
	public List<BookList> findBookListByAuthor(String author) {
		return (List<BookList>) repo.findBookListByAuthor(author);
	}

}
