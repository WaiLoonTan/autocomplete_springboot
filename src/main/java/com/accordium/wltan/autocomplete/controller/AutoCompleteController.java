package com.accordium.wltan.autocomplete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AutoCompleteController {

	@Autowired
	private AutoCompleteService service;

	@RequestMapping("/autocomplete")
	public String index() {
		return "index.html";
	}

}
