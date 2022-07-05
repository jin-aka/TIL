package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class SelectTest {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		ProductVO c = null;
		try {
			c = biz.get(1007);
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
