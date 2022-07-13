package com.multi.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.CateBiz;
import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CateVO;
import com.multi.vo.CustVO;
import com.multi.vo.ProductAVGVO;
import com.multi.vo.ProductVO;

@RestController
public class AJAXController {

	@Autowired
	CustBiz biz;
	@Autowired
	CateBiz catebiz;
	@Autowired
	ProductBiz pbiz;
	
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
	
	@RequestMapping("/catecheckid")
	public String catecheckid(String id) {
		
		
		String result = "";
		CateVO c = null;
		
		if(id.equals("") || id== null) {
			return "1";
		}
		
		try {
			c = catebiz.get(Integer.parseInt(id));
			if(c == null) {
				result = "0";
			}else {
				result="1";
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	@RequestMapping("/chart1")
	public Object chart1() {
		JSONArray ja = new JSONArray();
		List<ProductAVGVO> list = null;
		try {
			list = pbiz.get3();
			for (ProductAVGVO p : list) {
				JSONObject jo = new JSONObject();
				jo.put("name", p.getCatename());
				jo.put("y", p.getAvg());
				ja.add(jo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ja;
	}
}
