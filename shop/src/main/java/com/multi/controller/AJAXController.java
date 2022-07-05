package com.multi.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.CartBiz;
import com.multi.biz.CateBiz;
import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CartVO;
import com.multi.vo.CateVO;
import com.multi.vo.CustVO;
import com.multi.vo.ProductAVGVO;
import com.multi.vo.ProductVO;

@RestController
public class AJAXController {

	@Autowired
	CustBiz biz;

	@Autowired
	CartBiz cartbiz;
	
	@RequestMapping("addcart")
	public void addcart(String uid, int pid, int cnt) {
		try {
			cartbiz.register(new CartVO(uid, pid, cnt));
		}catch (Exception e){
			
		}
	}
	
	@RequestMapping("/checkid")
	public String checkid(String id) {
		String result = "";
		CustVO c = null;
		
		if(id.equals("") || id== null) {
			return "1";
		}
		
		try {
			c = biz.get(id);
			if(c==null) {
				result = "0";
			}else {
				result="1";
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}


}
