package com.capg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.model.Book;

@Repository
public interface IBookRepository extends CrudRepository<Book, Integer> {
	
	Book getBookBybookName(String bookName);
	Book getBookBybookAuthour(String bookAuthor);
	Book getBookBybookPublisher(String bookPublisher);
	
}
