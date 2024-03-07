package com.springsec.model;

public class Book {
    private String title;
    private String author;
    private int bookCount;
    private double bookPrice; // Added bookPrice property

    public Book(String title, String author, int bookCount, double bookPrice) {
        this.title = title;
        this.author = author;
        this.bookCount = bookCount;
        this.bookPrice = bookPrice;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

    // Getters and setters for title, author, bookCount, and bookPrice
}
