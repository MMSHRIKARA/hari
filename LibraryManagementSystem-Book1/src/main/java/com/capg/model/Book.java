package com.capg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int bookId;
private String bookName;
private String bookAuthor;
private int bookNumber;
private String bookPublisher;
public Book() 


{
}
public int getBookId() {
	return bookId;
}
public Book(int bookId, String bookName, String bookAuthor, int bookNumber, String bookPublisher) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookAuthor = bookAuthor;
	this.bookNumber = bookNumber;
	this.bookPublisher = bookPublisher;
}
public String getBookName() {
	return bookName;
}
public String getBookAuthor() {
	return bookAuthor;
}
public int getBookNumber() {
	return bookNumber;
}
public String getBookPublisher() {
	return bookPublisher;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public void setBookNumber(int bookNumber) {
	this.bookNumber = bookNumber;
}
public void setBookPublisher(String bookPublisher) {
	this.bookPublisher = bookPublisher;
}
}
//BookModelAlreadydoneILOrY
	
	
	
	

