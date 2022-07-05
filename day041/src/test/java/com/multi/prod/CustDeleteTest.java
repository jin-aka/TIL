package com.multi.prod;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;

@SpringBootTest
class CustDeleteTest {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		try {
			biz.remove("id22");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
