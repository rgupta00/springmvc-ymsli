package com.bookapp.web.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.dao.Book;
import com.bookapp.service.BookService;

@Controller
public class BookController {

	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	/*
	 * @PostConstruct public void init() { bookService.addBook(new Book("A123",
	 * "thinking in java", "bruce", 300)); bookService.addBook(new Book("M123",
	 * "java basics", "raj", 300)); }
	 */
	
	//allbooks: refer to url patter that u need to request
	@GetMapping("allbooks")
	public ModelAndView getallbooks(ModelAndView mv) {
		mv.setViewName("allbooks");// allbooks is a logical name of a jsp : viewResolver
		mv.addObject("books", bookService.getAllBooks());
		return mv;
	}
}
