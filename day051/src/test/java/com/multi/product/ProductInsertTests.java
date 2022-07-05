package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductInsertTests {
	
	@Autowired
	ProductBiz pbiz;

	@Test
	void contextLoads() {
		ProductVO c = new ProductVO(0,"ppp", 999999, null,3.4);
		try {
			pbiz.register(c);
			System.out.println("Registered OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}





