package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductBiz biz;

	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","product/left");
		mv.addObject("center", "product/center");
		return mv;
	}
	
	@RequestMapping("/register")
	public String register(Model m) {
		m.addAttribute("left","product/left");
		m.addAttribute("center", "product/register");
		return "main";
	}
	
	@RequestMapping("/registerimpl")
	public ModelAndView registerimpl(ModelAndView mv, ProductVO product) {
		mv.setViewName("main");
		mv.addObject("left","product/left");
		try {
			biz.register(product);
			mv.addObject("center", "product/registerok");
		} catch (Exception e) {
			mv.addObject("center", "product/registerfail");
		}		
		return mv;
	}
	
	@RequestMapping("/select")
	public ModelAndView select(ModelAndView mv) {
		mv.addObject("left","product/left");
		List<ProductVO> list = null;
		try {
			list = biz.get();
			mv.addObject("center", "product/select");
			mv.addObject("allproduct",list);
		} catch (Exception e) {
			
		}
		mv.setViewName("main");
		return mv;
	}
	@RequestMapping("/detail")
	public ModelAndView detail (ModelAndView mv, String id) {
		mv.addObject("left","product/left");
		ProductVO product = null;
		try {
			product = biz.get(null);
			mv.addObject("center", "product/detail");
			mv.addObject("dproduct",product);
		} catch (Exception e) {
			
		}
		mv.setViewName("main");
		return mv;		
	}
	
	@RequestMapping("/update")
	public ModelAndView update (ModelAndView mv, String id) {
		mv.addObject("left","product/left");
		ProductVO product = null;
		try {
			product = biz.get(null);
			mv.addObject("center", "product/update");
			mv.addObject("uproduct",product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		return mv;	
	}
	
	@RequestMapping("/updateimpl")
	public ModelAndView updateimpl(ModelAndView mv, ProductVO product) {
		mv.setViewName("main");
		mv.addObject("left","product/left");
		try {
			biz.modify(product);
			mv.addObject("center", "product/select");
		} catch (Exception e) {
			mv.addObject("center", "product/updatefail");
		}
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(ModelAndView mv, String id) {
		mv.setViewName("main");
		mv.addObject("left","product/left");
		try {
			biz.remove(null);
			mv.addObject("center", "product/select");
		} catch (Exception e) {
			mv.addObject("center", "product/updatefail");
		}
		return mv;
	}

	
}
