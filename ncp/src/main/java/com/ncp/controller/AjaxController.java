package com.ncp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncp.restapi.kakaoApi;

@RestController
public class AjaxController {
	
	@Autowired
	kakaoApi kakaoapi;
	
	@RequestMapping("kakaolocal")
	public Object kakaolocal(String keyword) throws Exception {
		System.out.println(keyword);
		String result = kakaoapi.kakaolocalapi(keyword);
		return result;
	}

}
