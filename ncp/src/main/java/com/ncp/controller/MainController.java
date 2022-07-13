package com.ncp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "index";
	}
	@RequestMapping("/loginimpl")
	public String loginimpl(HttpSession session,String id, String pwd) {
		session.setAttribute("loginid", id);
		return "index";
	}
	@RequestMapping("/kakao")
	public String kakao() {
		return "kakao";
	}
	@RequestMapping("/papago")
	public String papago() {
		return "papago";
	}
	@RequestMapping("/go")
	public String go() {
		return "go";
	}
	@RequestMapping("/websocket")
	public String websocket() {
		return "websocket";
	}
	
}
