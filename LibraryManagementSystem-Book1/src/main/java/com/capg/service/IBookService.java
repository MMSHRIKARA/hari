package com.capg.service;

import java.util.List;

import com.capg.model.Book;



public interface IBookService {

	
Book createBook(Book book);
	
	Book viewBookById(int bookId);
	
	List<Book> viewBook();
	
	Book updatebook(Book book);
	
	void removeBook(int bookId);

}

