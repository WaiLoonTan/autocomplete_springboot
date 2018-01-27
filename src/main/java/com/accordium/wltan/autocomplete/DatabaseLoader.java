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

// TODO: Auto-generated Javadoc
/**
 * The Class DatabaseLoader.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

	/** The repository. */
	private final AutoCompleteRepository repository;

	/**
	 * Instantiates a new database loader.
	 *
	 * @param repository the repository
	 */
	@Autowired
	public DatabaseLoader(AutoCompleteRepository repository) {
		this.repository = repository;
	}

	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... strings) throws Exception {

		// Step 1 : Initialise mapper
		ObjectMapper mapper = new ObjectMapper();

		// Step 2 : Read json file and convert to java object.
		List<BookList> listOfBookList = mapper.readValue(new File("src/main/resources/static/Booklist.json"),
				new TypeReference<List<BookList>>() {
				});
		
		//Step 3 : Save to database extracte values
		if (null != listOfBookList) {
			for (BookList bookList : listOfBookList) {
				this.repository.save(bookList);
			}
		}

	}

}
