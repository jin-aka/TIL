package com.ncp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncp.restapi.kakaoApi;
import com.ncp.restapi.naverApi;

@RestController
public class AjaxController {
	
	@Autowired
	kakaoApi kakaoapi;
	
	@Autowired
	naverApi naverapi;
	
	@RequestMapping("papagotr")
	public Object papagotr(String txt) throws Exception {
		Object obj = naverapi.papago(txt);
		return obj;
	}
	
	@RequestMapping("kakaolocal")
	public Object kakaolocal(String keyword) throws Exception {
		Object result = kakaoapi.kakaolocalapi(keyword);
		return result;
	}


}
