package com.bookapp.dao;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BookDaoImpl implements BookDao {

	private SessionFactory sessionFactory;
	
	@Autowired
	public BookDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public List<Book> getAllBooks() {
		return getSession().createQuery("select b from Book b").getResultList();
	}

	@Override
	public Book getBookById(int bookId) {
		return getSession().get(Book.class, bookId);
	}

	@Override
	public Book addBook(Book book) {
		getSession().persist(book);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		getSession().merge(book);
		return book;
	}

	@Override
	public Book removeBook(int bookId) {
		Book bookToBeDeleted=getBookById(bookId);
		getSession().delete(bookToBeDeleted);
		return bookToBeDeleted ;
	}

}
