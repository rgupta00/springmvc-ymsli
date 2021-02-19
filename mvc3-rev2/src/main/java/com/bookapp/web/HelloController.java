package com.bookapp.web;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	
	//@PathVariable
	
	//hello3?name=raj&age=44
//	@GetMapping("hello3")
//	public String helloMethod(
//			@RequestParam(name = "name",required = false, defaultValue = "raj") String userName, 
//			@RequestParam(name = "age",required = false, defaultValue = "40") int userAge,
//			Model model) {
//		
//		System.out.println(userName + " : " + userAge);
//		
//		model.addAttribute("key", "spring mvc by model map");
//		return "hello";
//  }
	
	
	
	
	//hello2/33
	//dont traped by required =false it dont work
	
	
//	@GetMapping("hello2/{id}/{name}")
//	public String helloMethod(@PathVariable(name = "id") String myid ,
//			@PathVariable(name = "name", required = false) String name, 
//			
//			Model model) {
//		System.out.println("------------");
//		System.out.println(myid);
//		System.out.println(name);
//		model.addAttribute("key", "spring mvc by model map");
//		return "hello";
//	}
//	
	
	
//	@GetMapping("hello")
//	public String helloMethod(Model model) {
//		model.addAttribute("key", "spring mvc by model map");
//		return "hello";
//	}
	
	//ModelAndView, ModelMap vs Model
	
//	@GetMapping("hello")
//	public ModelAndView helloMethod(ModelAndView mv) {
//		mv.setViewName("hello");
//		mv.addObject("key", "hello to spring mvc");
//		
//		return mv;
//	}
}
