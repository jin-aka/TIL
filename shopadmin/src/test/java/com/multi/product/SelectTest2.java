package com.multi.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class SelectTest2 {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		List<ProductVO> c = null;
		try {
			c = biz.get2();
			for (ProductVO obj : c) {
				System.out.println(obj);
			}
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
