package com.multi.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class SelectAllTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		List<ProductVO> list = null;
		try {
			list = biz.get();
			for (ProductVO ProductVO : list) {
				System.out.println(ProductVO);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
