package com.capg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.model.Book;
import com.capg.repository.IBookRepository;



@Service
public class BookService implements IBookService {
	@Autowired
	private IBookRepository repository;

	@Override
	public Book createBook(Book book) {
		return repository.save(book);
	}

	@Override
	public Book viewBookById(int bookId) {
		return repository.findById(bookId).get();
	}

	@Override
	public List<Book> viewBook() {
		List<Book> book = new ArrayList<Book>();
		repository.findAll().forEach(b1 -> book.add(b1));
		return book;
	}

	@Override
	public Book updatebook(Book book) {
		
		return repository.save(book);
	}

	@Override
	public void removeBook(int bookId) {
		repository.deleteById(bookId);
	}

}

