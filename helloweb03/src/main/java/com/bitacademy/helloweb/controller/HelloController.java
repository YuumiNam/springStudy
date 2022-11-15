package com.bitacademy.helloweb.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello2")
	public String hello2(String name) {
		System.out.println("name : " + name);
		return "/WEB-INF/views/hello.jsp";
	}
	
	// Parameter값을 전달받는 forward방식
	@RequestMapping("/hello3")
	public ModelAndView hello3(String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name);
		mav.setViewName("/WEB-INF/views/hello3.jsp");
		
		return mav;
	}
	
	// Parameter값을 전달받는 forward방식 (추천)
	@RequestMapping("/hello4")
	public String hello4(String name, Model model) {
		model.addAttribute("name", name);
		return ("/WEB-INF/views/hello3.jsp");
	}
	
	@ResponseBody
	@RequestMapping("/hello5")
	public String hello5() {
		return "<h1>Hello World!</h1>";
	}
	
	// redirect response
	@RequestMapping("/hello6")
	public String hello6() {
		return "redirect:/hello"; // helloweb03 까지는 적어줄필요 없음 이미 tomcat이 영역을 한정했음
	}
	
	
	// spring와서도 굳이 이렇게 쓰면 안됨
	@RequestMapping("/hello7")
	public void hello6(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		String name = request.getParameter("name");
		response.getWriter().println("hello " + name);
	}
}
