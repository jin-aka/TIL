package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;
import com.multi.vo.CustVO;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartBiz biz;
	
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<CartVO> list = null;
		try {
			list = biz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center","cart/select");
		return "/index";
	}
	
	@RequestMapping("/detail")
	public String detail (Model m, Integer id) {
		CartVO obj = null;
		try {
			obj = biz.get(id);
			m.addAttribute("c", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center","cart/detail");
		return "/index";
	}
	
	@RequestMapping("/update")
	public String update(Model m, CartVO obj) {
		try {
			biz.modify(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+obj.getId();
}


}
