package com.accordium.wltan.autocomplete.repository;

import org.springframework.data.repository.CrudRepository;

import com.accordium.wltan.autocomplete.model.BookList;

/**
 * The Interface AutoCompleteRepository.
 */
public interface AutoCompleteRepository extends CrudRepository<BookList, String> {

}
