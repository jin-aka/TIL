package com.multi.prod;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProdSelectAllTest {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		List<ProductVO> list = null;
		try {
			list = biz.get();
			for (ProductVO pvo : list) {
				System.out.println(pvo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
