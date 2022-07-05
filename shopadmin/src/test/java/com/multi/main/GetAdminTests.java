package com.multi.main;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MainBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.AdminVO;
import com.multi.vo.ProductAVGVO;
import com.multi.vo.ProductVO;

@SpringBootTest
class GetAdminTests {
	
	@Autowired
	MainBiz biz;

	@Test
	void contextLoads() {
		AdminVO ad = null;
		try {
			ad = biz.getAdmin("admin");
			System.out.println(ad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
