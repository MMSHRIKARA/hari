package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.Book;
import com.capg.service.BookService;





@RestController
@RequestMapping("/Books")
public class BookController {
	@Autowired
	private BookService service;

	@PostMapping("/create")
	public ResponseEntity<Book> createBook(@RequestBody Book Book) {
		Book lib = service.createBook(Book);
		return new ResponseEntity<Book>(lib, HttpStatus.CREATED);
	}

	@GetMapping("/viewById/{BookId}")
	public ResponseEntity<Book> viewBook(@PathVariable("bookId") int bookId) {
		Book lib = service.viewBookById(bookId);
		return new ResponseEntity<Book>(lib, HttpStatus.OK);
	}

	@GetMapping("/viewAllBook")
	public List<Book> viewAllBook() {
		return service.viewBook();
	}

	@PutMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		
		return service.updatebook(book);
	
	}

	@DeleteMapping("/deleteBook/{bookId}")
	public void removeBook(@PathVariable("bookId") int bookId) {
		service.removeBook(bookId);
	}

}


