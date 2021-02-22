package com.bookapp.web.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;

@Controller
public class BookController {

	private BookService bookService;
	
	
	//@PostConstruct
	public void init() {
		bookService.addBook(new Book("A2w", "java basics", "raj", 1000));
		bookService.addBook(new Book("A2M", "Spring basics", "raj", 1000));
		
	}
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/allbooks")
	public ModelAndView getallbooks(ModelAndView mv) {
		mv.setViewName("allbooks");
		mv.addObject("books", bookService.getAllBooks());
		return mv;
	}
	
	@GetMapping("/addbook")
	public String getAddBook(ModelMap map) {
		map.addAttribute("book", new Book());
		return "addbook";
	}
}



