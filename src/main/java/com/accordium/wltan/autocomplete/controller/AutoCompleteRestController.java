package com.accordium.wltan.autocomplete.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accordium.wltan.autocomplete.model.BookList;
import com.accordium.wltan.autocomplete.model.BookListSuggestionWrapper;

// TODO: Auto-generated Javadoc
/**
 * The Class AutoCompleteRestController.
 */
@RestController
@RequestMapping("/autocomplete")
public class AutoCompleteRestController {

	/** The service. */
	@Autowired
	private AutoCompleteService service;

	/**
	 * Find all books.
	 *
	 * @param author the author
	 * @return the book list suggestion wrapper
	 */
	@RequestMapping(path = "/findall", method = RequestMethod.GET)
	public BookListSuggestionWrapper findAllBooks(@RequestParam("author") String author) {
		//Step 1 : Call service to retrieve all book list
		List<BookList> bookList = service.findAllBookList();

		List<String> series = new ArrayList<String>();
		
		//Step 2 : Intialise wrapper to pass to front end client.
		BookListSuggestionWrapper wrapper = new BookListSuggestionWrapper();

		//Step 3 : Perform filter logic with each character.
		if (author != null) {
			for (BookList bookList2 : bookList) {
				if (bookList2.getAuthor().contains(author) || bookList2.getAuthor().equalsIgnoreCase(author)) {
					if (!bookList2.getName().isEmpty()) {
						series.add(bookList2.getName());
					}
				}
			}
		}
		
		wrapper.setSuggestions(series);
		
		//Return wrapper to front end.
		return wrapper;

	}

}
