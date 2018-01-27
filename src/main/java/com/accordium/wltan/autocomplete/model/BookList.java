package com.accordium.wltan.autocomplete.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

// TODO: Auto-generated Javadoc
/**
 * The Class BookList.
 */
@Entity
@Table(name = "BookListEntity")
public class BookList {
	
	/** The unique id. */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name="uuid2", strategy = "uuid2")
	@Column(name = "id", length = 1024)
	private String id;
	
	/** The author. */
	@Column(name = "author", length = 1024)
	private String author;
	
	/** The series. */
	@Column(name = "series", length = 1024)
	private String series;
	
	/** The name. */
	@Column(name = "name", length = 1024)
	private String name;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * Gets the series.
	 *
	 * @return the series
	 */
	public String getSeries() {
		return series;
	}
	
	/**
	 * Sets the series.
	 *
	 * @param series the new series
	 */
	public void setSeries(String series) {
		this.series = series;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
