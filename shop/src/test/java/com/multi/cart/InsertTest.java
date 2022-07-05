package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class InsertTest {

	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		CartVO c = new CartVO("id06", 1029,2);
		try {
			biz.register(c);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}

 }
}
