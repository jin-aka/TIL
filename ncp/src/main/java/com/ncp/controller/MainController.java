package com.ncp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main() {
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
}
