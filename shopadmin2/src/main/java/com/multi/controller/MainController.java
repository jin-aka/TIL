package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@Controller
public class MainController {

	@Autowired
	CustBiz custbiz;
	
	@RequestMapping("/")
	public String home() {
		return "home";	
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/requestlogin")
	public String requestlogin(String id, String pwd) {
		System.out.println(id+" "+pwd);
		CustVO cust = null;	
		try {
			cust = custbiz.get(id);
			if(cust != null) {
				if(cust.getPwd().equals(pwd)) {
					return "home";
				}
			}else {
				return "login";
			}
		} catch (Exception e) {
			
		}
		return "home";
	}
}
