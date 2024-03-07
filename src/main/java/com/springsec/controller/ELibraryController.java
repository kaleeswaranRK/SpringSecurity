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

	// Mock data for demonstration purposes
	private List<Book> books = List.of(new Book("Book 1", "Author 1"), new Book("Book 2", "Author 2"),
			new Book("Book 3", "Author 3"));

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

		books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
		books.add(new Book("1984", "George Orwell"));
		books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
		books.add(new Book("Pride and Prejudice", "Jane Austen"));
		books.add(new Book("The Catcher in the Rye", "J.D. Salinger"));
		return books;
	}

	// Book class for demonstration

}
