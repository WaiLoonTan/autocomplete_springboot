package com.accordium.wltan.autocomplete;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.accordium.wltan.autocomplete.model.BookList;
import com.accordium.wltan.autocomplete.repository.AutoCompleteRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final AutoCompleteRepository repository;

	@Autowired
	public DatabaseLoader(AutoCompleteRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {

		// Read json file and convert to java object.
		ObjectMapper mapper = new ObjectMapper();

		List<BookList> listOfBookList = mapper.readValue(new File("src/main/resources/static/Booklist.json"),
				new TypeReference<List<BookList>>() {
				});
		
		if (null != listOfBookList) {
			for (BookList bookList : listOfBookList) {
				this.repository.save(bookList);
			}
		}

	}

}
