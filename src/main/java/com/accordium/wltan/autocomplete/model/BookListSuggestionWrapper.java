package com.accordium.wltan.autocomplete.model;


import java.util.List;

/**
 * The Class BookListSuggestionWrapper.
 */
public class BookListSuggestionWrapper {

  /** List of suggestions. */
  List<String> suggestions;

  /**
   * Gets the suggestions.
   *
   * @return the suggestions
   */
  public List<String> getSuggestions() {
    return suggestions;
  }

  /**
   * Sets the suggestions.
   *
   * @param suggestions the new suggestions
   */
  public void setSuggestions(List<String> suggestions) {
    this.suggestions = suggestions;
  }
}