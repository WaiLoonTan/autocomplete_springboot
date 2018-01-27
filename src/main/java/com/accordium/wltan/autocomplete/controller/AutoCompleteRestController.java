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

@RestController
@RequestMapping("/autocomplete")
public class AutoCompleteRestController {

	@Autowired
	private AutoCompleteService service;

	@RequestMapping(path = "/findall", method = RequestMethod.GET)
	public BookListSuggestionWrapper findAllBooks(@RequestParam("author") String author) {
		System.out.println("Initial Author :: " + author);
		List<BookList> bookList = service.findAllBookList();

		List<String> series = new ArrayList<String>();
		
		BookListSuggestionWrapper wrapper = new BookListSuggestionWrapper();

		if (author != null) {
			for (BookList bookList2 : bookList) {
				if (bookList2.getAuthor().contains(author) || bookList2.getAuthor().equalsIgnoreCase(author)) {
					System.out.println("Contain Author :: " + author);
					if (!bookList2.getSeries().isEmpty()) {
						System.out.println("Adding series :: " + bookList2.getSeries());
						series.add(bookList2.getSeries());
					}
				}
			}
		}
		
		wrapper.setSuggestions(series);

		return wrapper;

	}

	@RequestMapping(value = "/findAllBooksByAuthor", method = RequestMethod.GET)
	public List<BookList> findAllBooksByAuthor(@RequestParam("author") String author) {
		System.out.println("Inside findAllBooksByAuthor + " + author);
		List<BookList> bookList = service.findBookListByAuthor(author);

		if (null != bookList)
			System.out.println("findAllBooksByAuthor author List :: " + bookList.size());
		return bookList;
	}
}
