package com.springsec.model;

public class Book {
	private String title;
	private String author;
	private int bookCount;

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	public Book(String title, String author) {
		this.setTitle(title);
		this.setAuthor(author);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// Getters and setters
}
