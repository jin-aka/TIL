package com.multi.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductAVGVO;
import com.multi.vo.ProductVO;

@SpringBootTest
class SelectTest3 {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		List<ProductAVGVO> c = null;
		try {
			c = biz.get3();
			for (ProductAVGVO obj : c) {
				System.out.println(obj);
			}
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
