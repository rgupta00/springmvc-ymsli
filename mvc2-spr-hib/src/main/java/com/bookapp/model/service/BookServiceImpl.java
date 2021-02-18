package com.bookapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;
@Transactional
@Service
public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookId) {
		return bookDao.getBookById(bookId);
	}

	@Override
	public Book addBook(Book book) {
		return bookDao.addBook(book);
		
	}

	@Override
	public Book updateBook(Book book) {
		return bookDao.updateBook(book);
	}

	@Override
	public Book removeBook(int bookId) {
		return bookDao.removeBook(bookId);
	}

}
