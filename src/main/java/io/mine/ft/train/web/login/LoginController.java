package io.mine.ft.train.web.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {
	
	

	@RequestMapping("/menuList")
	public ModelAndView menuList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	@RequestMapping("/ws")
	public ModelAndView wsPage(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("ws");
		return mv;
	}
	
	@RequestMapping("/ws2")
	public ModelAndView send() {
		ModelAndView mv = new ModelAndView("ws2");
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
}
