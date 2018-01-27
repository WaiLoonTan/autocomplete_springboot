package com.accordium.wltan.autocomplete.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.accordium.wltan.autocomplete.model.BookList;

public interface AutoCompleteRepository extends CrudRepository<BookList, String> {

	@Query("select u from BookList u where u.author like ('%' || (:author) || '%')) ")
	List<BookList> findBookListByAuthor(@Param("author") String author);
	
	
}
