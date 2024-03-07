package com.springsec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springsec.model.Book;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ELibraryController {

	@GetMapping("/elibrary")
	public String showELibraryPage() {
		return "elibrary";
	}

	@GetMapping("/search")
	public String searchBooks(@RequestParam("query") String query, Model model) {
		// Perform book search based on the query (e.g., search in database)
		// For demonstration purposes, we'll just return a static list of books
		List<Book> searchResults = searchBooksInDatabase(query);

		// Add search results to the model
		model.addAttribute("books", searchResults);

		// Return the name of the Thymeleaf template for displaying search results
		return "elibrary";
	}

	// Dummy method to search books in a database (replace with actual search logic)
	private List<Book> searchBooksInDatabase(String query) {
		// For demonstration purposes, return a static list of books
		List<Book> books = new ArrayList<Book>();

		books.add(new Book("To Kill a Mockingbird", "Harper Lee", 10, 15.99)); // Assuming the price for this book is 15.99
		books.add(new Book("1984", "George Orwell", 20, 12.50)); // Assuming the price for this book is 12.50
		books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 30, 18.75)); // Assuming the price for this book is 18.75
		books.add(new Book("Pride and Prejudice", "Jane Austen", 40, 10.25)); // Assuming the price for this book is 10.25
		books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 50, 14.99)); // Assuming the price for this book is 14.99

		return books;
	}

	// Book class for demonstration

}
