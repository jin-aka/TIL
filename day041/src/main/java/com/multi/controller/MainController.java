package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@Controller
public class MainController {
	
	@Autowired
	CustBiz biz;
	
	@Autowired
	ProductBiz pbiz;
	
	@RequestMapping("/")
	public String main() {
		return "main";		
	}
	
	@RequestMapping("/chart")
	public String chart() {
		return "chart";		
	}
	
	@RequestMapping("/custadd")
	public String custadd() {
		return "custadd";		
	}
	
	@RequestMapping("/productadd")
	public String productadd() {
		return "productadd";		
	}
	
	@RequestMapping("/custaddimpl")
	public ModelAndView custaddimpl(ModelAndView mv, CustVO cust) {
		String next = "custaddok";
		try {
			biz.register(cust);
			mv.addObject("rcust",cust);
		} catch (Exception e) {
			next = "custaddfail";
		}
		mv.setViewName(next);
		return mv;		
	}
	
	@RequestMapping("/productaddimpl")
	public ModelAndView productaddimpl(ModelAndView mv, ProductVO p) {
		String next = "productaddok";
		try {
			pbiz.register(p);
			mv.addObject("rproduct",p);
		} catch (Exception e) {
			next = "productaddfail";
		}
		mv.setViewName(next);
		return mv;		
	}
	
	@RequestMapping("/custselect")
	public ModelAndView custselect(ModelAndView mv) {
		List<CustVO> list = null;
		try {
			list = biz.get();
			mv.addObject("allcust",list);
		} catch (Exception e) {
			
		}
		mv.setViewName("custselect");
		return mv;		
	}
	
	@RequestMapping("/productselect")
	public ModelAndView productselect(ModelAndView mv) {
		List<ProductVO> list = null;
		try {
			list = pbiz.get();
			mv.addObject("allproduct",list);
		} catch (Exception e) {
			
		}
		mv.setViewName("productselect");
		return mv;		
	}
	
	@RequestMapping("/custdetail")
	public ModelAndView custdetail(ModelAndView mv, String id) {
		CustVO cust = null;
		try {
			cust = biz.get(id);
			mv.addObject("dcust",cust);
		} catch (Exception e) {
			
		}
		mv.setViewName("custdetail");
		return mv;		
	}
	
	@RequestMapping("/productdetail")
	public ModelAndView productdetail(ModelAndView mv, int id) {
		ProductVO p = null;
		try {
			p = pbiz.get(id);
			mv.addObject("dproduct",p);
		} catch (Exception e) {
			
		}
		mv.setViewName("productdetail");
		return mv;		
	}
	
	@RequestMapping("/custdelete")
	public String custdelete(String id) {
		try {
			biz.remove(id);
		} catch (Exception e) {
			
		}
		return "redirect:custselect";		
	}
	
	@RequestMapping("/productdelete")
	public String productdelete(int id) {
		try {
			pbiz.remove(id);
		} catch (Exception e) {
			
		}
		return "redirect:productselect";		
	}

	
	@RequestMapping("/custupdate")
	public ModelAndView custupdate(ModelAndView mv,String id) {
		CustVO cust = null;
		try {
			cust = biz.get(id);
			mv.addObject("ucust",cust);
		} catch (Exception e) {
			
		}
		mv.setViewName("custupdate");
		return mv;		
	}
	
	@RequestMapping("/productupdate")
	public ModelAndView productupdate(ModelAndView mv,int id) {
		ProductVO p = null;
		try {
			p = pbiz.get(id);
			mv.addObject("uproduct",p);
		} catch (Exception e) {
			
		}
		mv.setViewName("productupdate");
		return mv;		
	}
	
	@RequestMapping("/custupdateimpl")
	public String custupdateimpl(CustVO cust) {
		try {
			biz.modify(cust);
		} catch (Exception e) {
			
		}
		return "redirect:custdetail?id="+cust.getId();		
	}
	
	@RequestMapping("/productupdateimpl")
	public String productupdateimpl(ProductVO p) {
		try {
			pbiz.modify(p);
		} catch (Exception e) {
			
		}
		return "redirect:productdetail?id="+p.getId();		
	}
}
