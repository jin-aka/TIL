package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;

@SpringBootTest
class DeleteTest {

	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		try {
			biz.remove(2);
			System.out.println("deteted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
