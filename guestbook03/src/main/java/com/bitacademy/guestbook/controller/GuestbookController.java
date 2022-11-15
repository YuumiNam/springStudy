package com.bitacademy.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitacademy.guestbook.repository.GuestbookRepository;
import com.bitacademy.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {
	@Autowired
	private GuestbookRepository guestbookrepository;
	
	@RequestMapping("")
	public String index(Model model) {
		List<GuestbookVo> list =  guestbookrepository.findAll();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(GuestbookVo vo) {
		guestbookrepository.insert(vo);
		return "redirect:/";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete() {
		return "/WEB-INF/views/delete.jsp";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(Long no, String password) {
		
		guestbookrepository.deleteByNoAndPassword(no, password);
		return "redirect:/";
	}
}
