package com.bookapp.service;

import java.util.List;

import com.bookapp.dao.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public Book getBookById(int bookId);
	public Book addBook(Book book);
	public Book updateBook(Book book);
	public Book removeBook(int bookId);
}
