package com.accordium.wltan.autocomplete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.accordium.wltan.autocomplete.controller.AutoCompleteController;

// TODO: Auto-generated Javadoc
/**
 * The Class AutocompleteApplication.
 */
@SpringBootApplication
public class AutocompleteApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(AutocompleteApplication.class, args);
	}
}
