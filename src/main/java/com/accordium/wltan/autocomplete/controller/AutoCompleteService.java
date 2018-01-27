package com.accordium.wltan.autocomplete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.accordium.wltan.autocomplete.model.BookList;
import com.accordium.wltan.autocomplete.repository.AutoCompleteRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class AutoCompleteService.
 */
@Component
@Order(20)
public class AutoCompleteService {

	/** The repo. */
	@Autowired
	private AutoCompleteRepository repo;

	/**
	 * Find all book list.
	 *
	 * @return the list
	 */
	public List<BookList> findAllBookList() {
		return (List<BookList>) repo.findAll();
	}
	
}
