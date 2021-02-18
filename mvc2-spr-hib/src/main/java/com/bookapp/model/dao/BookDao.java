package com.bookapp.model.dao;

import java.util.List;

public interface BookDao{
	public List<Book> getAllBooks();
	public Book getBookById(int bookId);
	public Book addBook(Book book);
	public Book updateBook(Book book);
	public Book removeBook(int bookId);
}