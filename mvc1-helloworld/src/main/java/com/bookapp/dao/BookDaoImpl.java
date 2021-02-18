package com.bookapp.dao;

import java.util.*;

import org.springframework.stereotype.Repository;
@Repository
public class BookDaoImpl implements BookDao {

	@Override
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book("123ABC", "rich dad poor dad"	, "RK", 200)
				,new Book("123MBC", "monk who sold the farrari"	, "RS", 200));
	}

	@Override
	public Book getBookById(int bookId) {
		return null;
	}

	@Override
	public Book addBook(Book book) {
		System.out.println("book is added...");
		return null;
	}

	@Override
	public Book updateBook(Book book) {
		return null;
	}

	@Override
	public Book removeBook(int bookId) {
		return null;
	}

}
