package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.CustBiz;
import com.multi.frame.Biz;
import com.multi.vo.CustVO;

@Controller
@RequestMapping("/cust")
public class CustController {
	
	@Autowired
	CustBiz biz;
	
	@RequestMapping("add")
	public String add(Model m) {
		m.addAttribute("center","cust/add");
		return "/index";		
	}
	
	@RequestMapping("addimpl")
	public String addimpl(Model m, CustVO obj) {
		try {
			biz.register(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:detail?id="+obj.getId();		
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<CustVO> list = null;
		try {
			list  = biz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		m.addAttribute("center","cust/select");
		return "/index";	
	}
		
	@RequestMapping("/detail")
	public String detail (Model m, String id) {
		CustVO obj = null;
		try {
			obj = biz.get(id);
			m.addAttribute("c", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center","cust/detail");
		return "/index";
	}
	
	@RequestMapping("/update")
	public String update(Model m, CustVO obj) {
		try {
			biz.modify(obj);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return "redirect:detail?id="+obj.getId();
}

	
}
