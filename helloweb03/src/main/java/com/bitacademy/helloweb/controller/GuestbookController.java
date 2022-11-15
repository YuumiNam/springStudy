package com.bitacademy.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  @RequestMapping 클래스 단독 매핑
 */

@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping // 이때는 메소드이름을 url로 씀
	public String list() {
		return "GuestbookController.list()";
	}
	
	@ResponseBody
	@RequestMapping // 이때는 메소드이름을 url로 씀
	public String delete() {
		return "GuestbookController.delete()";
	}
}
