package com.bitacademy.emaillist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitacademy.emaillist.repository.EmaillistRepository;
import com.bitacademy.emaillist.vo.EmaillistVo;

@Controller
public class EmaillistController {
	// 자동으로 필드를 Dao와 묶어줌 (DI과정)
	@Autowired
	private EmaillistRepository emaillistRepository;
	
	@RequestMapping("")
	public String index(Model model) {
		List<EmaillistVo> list = emaillistRepository.findAll();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add() {
		return "/WEB-INF/views/add.jsp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(EmaillistVo vo) {
		System.out.println(vo);
		// emaillistRepository.insert(vo);
		return "redirect:/";
	}
}
