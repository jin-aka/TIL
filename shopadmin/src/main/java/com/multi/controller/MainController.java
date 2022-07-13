package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.AdminBiz;
import com.multi.biz.CustBiz;
import com.multi.biz.MainBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.AdminVO;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@Controller
public class MainController {
	
	@Autowired
	MainBiz biz;
	
	@RequestMapping("/")
	public String main(Model m) {
		int ccnt = 0;
		int pcnt = 0;
		try {
			ccnt = biz.getCustCnt();
			pcnt = biz.getProductCnt();
			m.addAttribute("ccnt", ccnt);
			m.addAttribute("pcnt", pcnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";		
	}

	@RequestMapping("/search")
	public String search(Model m, String txt) {
		List<ProductVO> list = null;
		try {
			list = biz.searchProduct(txt);
			m.addAttribute("sproduct", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "search");
		return "/index";
	}
	
	@RequestMapping("/login")
	public String login(Model m, String msg) {
		if(msg != null && msg.equals("f")) {
			m.addAttribute("msg","login fail!!");
		}
		m.addAttribute("center", "login");
		return "/index";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(Model m, String id, String pwd, HttpSession session) {
		AdminVO admin = null;
		try {
			admin = biz.getAdmin(id);
			if(admin == null) {
				throw new Exception();
			}
			if(admin.getPwd().equals(pwd)) {
				session.setAttribute("loginadmin", admin);
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			return "redirect:/login?msg=f";
		}
		
		return "index";		
	}
	
	@RequestMapping("/logout")
	public String logout(Model m, HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "index";		
	}
}
