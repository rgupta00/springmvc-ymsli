package com.bookapp.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;

import java.util.*;
//@WebServlet("/bookController")
//public class BookContoller extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//   
//	private BookService bookService=new BookServiceImpl();
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("/WEB-INF/views/addbook.jsp").forward(request, response);
//	}
//
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		//if u use plane servlet jsp :
//		/*
//		 * it dont support :
//		 * server side form validateion
//		 * form buffing
//		 * data conversion
//		 */
//		String isbn=request.getParameter("isbn");
//		String title=request.getParameter("title");
//		String author=request.getParameter("author");
//		double price=Double.parseDouble(request.getParameter("price"));
//		// that isbn should be 6 char, title should be 5 
//		Map<String , String> errorMap=new HashMap<String, String>();
//		errorMap.put("isbn", "isbn should be 6 char");
//		
//		Book book=new Book(isbn, title, author, price);
//		bookService.addBook(book);
//		// you have to delare a map
//		request.getRequestDispatcher("/WEB-INF/views/success.jsp").forward(request, response);;
//		
//	}
//
//}
