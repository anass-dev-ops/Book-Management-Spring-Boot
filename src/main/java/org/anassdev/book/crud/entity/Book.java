package org.anassdev.book.crud.entity;

import java.io.Serializable;

public class Book implements Serializable{

	private static final long serialVersionUID = 228846996907232220L;
	
	private Long id;
	private String title;
	private String price;
	private String author;
	private String edition;
	private String lang;
	private String pagesNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getPagesNumber() {
		return pagesNumber;
	}
	public void setPagesNumber(String pagesNumber) {
		this.pagesNumber = pagesNumber;
	}
	public Book(Long id, String title, String price, String author, String edition, String lang, String pagesNumber) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
		this.edition = edition;
		this.lang = lang;
		this.pagesNumber = pagesNumber;
	}
	public Book() {
		super();
	}
	
	

}
