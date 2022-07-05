package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@Controller
@RequestMapping("/cust")
public class CustController {
	
	@Autowired
	CustBiz biz;

	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center", "cust/center");
		return mv;
	}

	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center", "cust/register");
		return mv;
	}

	@RequestMapping("/registerimpl")
	public ModelAndView registerimpl(ModelAndView mv, CustVO cust) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		try {
			biz.register(cust);
			mv.addObject("center", "cust/registerok");
			mv.addObject("rcust",cust);
		} catch (Exception e) {
			mv.addObject("center", "cust/registerfail");
		}		
		return mv;
	}
	
	@RequestMapping("/select")
	public ModelAndView select(ModelAndView mv) {
		mv.addObject("left","cust/left");
		List<CustVO> list = null;
		try {
			list = biz.get();
			mv.addObject("center", "cust/select");
			mv.addObject("allcust",list);
		} catch (Exception e) {
			
		}
		mv.setViewName("main");
		return mv;
	}
	@RequestMapping("/detail")
	public ModelAndView detail (ModelAndView mv, String id) {
		mv.addObject("left","cust/left");
		CustVO cust = null;
		try {
			cust = biz.get(id);
			mv.addObject("center", "cust/detail");
			mv.addObject("dcust",cust);
		} catch (Exception e) {
			
		}
		mv.setViewName("main");
		return mv;		
	}
	
	@RequestMapping("/update")
	public ModelAndView update (ModelAndView mv, String id) {
		mv.addObject("left","cust/left");
		CustVO cust = null;
		try {
			cust = biz.get(id);
			mv.addObject("center", "cust/update");
			mv.addObject("ucust",cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		return mv;	
	}
	
	@RequestMapping("/updateimpl")
	public ModelAndView updateimpl(ModelAndView mv, CustVO cust) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		try {
			biz.modify(cust);
			mv.addObject("center", "cust/select");
		} catch (Exception e) {
			mv.addObject("center", "cust/updatefail");
		}
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(ModelAndView mv, String id) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		try {
			biz.remove(id);
			mv.addObject("center", "cust/select");
		} catch (Exception e) {
			mv.addObject("center", "cust/updatefail");
		}
		return mv;
	}

	
}
