package com.bookapp.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionContoller {

	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handle404() {
		System.out.println("------------------------------------");
		ModelAndView mv = new ModelAndView();
		System.out.println();
		mv.setViewName("404");
		mv.addObject("message", "resouce is not found");
		return mv;
	}

	
	@ExceptionHandler(DataAccessException.class)
	public ModelAndView handleDBException(HttpServletRequest request, Exception ex) {
		System.out.println("-----------------------------");
		System.out.println(ex.getCause());
		System.out.println("-----------------------------");
		ModelAndView mv = new ModelAndView();
		System.out.println();
		mv.setViewName("dberror");
		mv.addObject("message", "db error");
		mv.addObject("url", request.getRequestURL());
		
		return mv;
	}


	@ExceptionHandler(Exception.class)
	public ModelAndView handleall() {
		System.out.println("------------------------------------");
		ModelAndView mv = new ModelAndView();
		System.out.println();
		mv.setViewName("error");
		mv.addObject("error", "please try after time :(");
		return mv;
	}
}
