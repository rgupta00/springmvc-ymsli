package com.bookapp.web.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;

//http://localhost:8080/mvc2-spr-hib/bookapp/allbooks
@Controller
//@RequestMapping("/bookapp")
public class BookController {

	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	//@RequestMapping(path = "/allbooks", method = RequestMethod.GET)
	@GetMapping("/allbooks")
	public ModelAndView getallbooks(ModelAndView mv) {
		mv.setViewName("allbooks");// allbooks is a logical name of a jsp : viewResolver
		mv.addObject("books", bookService.getAllBooks());
		return mv;
	}
}
