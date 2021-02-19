package com.bookapp.web.frombeans;

import com.bookapp.model.dao.Book;

public class Mapper {

	public static Book getBookFromBookForm(BookForm bookForm) {
		Book book=new Book();
		book.setId(bookForm.getId());
		book.setIsbn(bookForm.getIsbn());
		book.setTitle(bookForm.getTitle());
		book.setAuthor(bookForm.getAuthor());
		book.setCity(bookForm.getCity());
		book.setPrice(bookForm.getPrice());
		book.setPubEmail(book.getPubEmail());
		book.setPublisher(bookForm.getPublisher());
		book.setBookType(bookForm.getBookType());
		book.setPubDate(bookForm.getPubDate());
		return book;
	}
	
	public static BookForm getBookFormToBook(Book book) {
		BookForm bookForm=new BookForm();
	
		bookForm.setId(book.getId());
		bookForm.setIsbn(book.getIsbn());
		bookForm.setTitle(book.getTitle());
		bookForm.setAuthor(book.getAuthor());
		bookForm.setCity(book.getCity());
		bookForm.setPrice(book.getPrice());
		bookForm.setPubEmail(book.getPubEmail());
		bookForm.setPublisher(book.getPublisher());
		bookForm.setBookType(book.getBookType());
		bookForm.setPubDate(book.getPubDate());
		return bookForm;
	}
}
