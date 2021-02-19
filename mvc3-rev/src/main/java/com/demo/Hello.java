package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/myproj")
public class Hello {

	@GetMapping("myendpoint")
	//@RequestMapping(path = "/myendpoint", method = RequestMethod.GET)
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("mypage");
		mv.addObject("key", "spring mvc hello world");
		return mv;
	}
	
}
