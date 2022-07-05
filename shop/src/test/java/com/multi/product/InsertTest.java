package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@SpringBootTest
class InsertTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		ProductVO c = new ProductVO("note1", 140, 80, "note1.jpg");
		try {
			biz.register(c);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}

 }
}
