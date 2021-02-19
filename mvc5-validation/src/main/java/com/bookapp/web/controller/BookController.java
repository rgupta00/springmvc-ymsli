package com.bookapp.web.controller;

import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookType;
import com.bookapp.model.service.BookService;
import com.bookapp.web.frombeans.BookForm;
import com.bookapp.web.frombeans.Mapper;

@Controller
public class BookController {

	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	// ----------all books-------------
	@GetMapping(path = { "", "/allbooks" })
	public ModelAndView getallbooks(ModelAndView mv) {
		mv.setViewName("allbooks");
		mv.addObject("books", bookService.getAllBooks());
		return mv;
	}

	// --------get of addBook---------------------
	@GetMapping("/addbook")
	public String getAddBook(ModelMap map) {
		System.out.println("addbook is called...");
		map.addAttribute("bookForm", new BookForm());
		return "addbook";
	}

	@GetMapping("/update")
	public String getUpdateBook(@RequestParam(name = "id") int bookId, ModelMap map) {
		Book book = bookService.getBookById(bookId);
		// we want covert book to bookForm
		ModelMapper mapper = new ModelMapper();
		BookForm bookForm = mapper.map(book, BookForm.class);

		// BookForm bookForm = Mapper.getBookFormToBook(book);
		map.addAttribute("bookForm", bookForm);
		return "update";
	}

	@GetMapping("/delete")
	public String deleleBook(@RequestParam(name = "id") int bookId) {
		bookService.removeBook(bookId);
		return "redirect:/allbooks";
	}
	// hey spring pl call this method each req
	// whatever return from this method please put into req scope with key
	// "booktypes"

	@ModelAttribute(name = "booktypes")
	public BookType[] getBookTypes() {
		System.out.println("---getBookTypes is called-");
		return BookType.values();
	}

	@ModelAttribute(name = "cities")
	public List<String> getAllCities() {
		return Arrays.asList("noida", "delhi", "chennai", "banglore");
	}

	// how to force spring mvc to respect jsr 303 validation ?
	// @valid anno force spring mvc to respect validation annotations
	// validation is valid or not? spring bindingResult
	@PostMapping("/addbook")
	public String postAddBook(@Valid @ModelAttribute(name = "bookForm") BookForm bookForm,
			BindingResult bindingResult) {
		Integer id = bookForm.getId();

		ModelMapper mapper = new ModelMapper();
		Book book = mapper.map(bookForm, Book.class);

		// Book book = Mapper.getBookFromBookForm(bookForm);

		if (bindingResult.hasErrors()) {
			return "addbook";
		} else {
			bookService.addBook(book);
			return "redirect:/allbooks";// prg pattern?
		}
	}

	@PostMapping("/updatebook")
	public String updateAddBook(@Valid @ModelAttribute(name = "bookForm") BookForm bookForm,
			BindingResult bindingResult) {
		Integer id = bookForm.getId();

		ModelMapper mapper = new ModelMapper();
		Book book = mapper.map(bookForm, Book.class);


		if (bindingResult.hasErrors()) {
			return "update";
		} else {

				bookService.updateBook(book);
	
			return "redirect:/allbooks";// prg pattern?
		}
	}

}
