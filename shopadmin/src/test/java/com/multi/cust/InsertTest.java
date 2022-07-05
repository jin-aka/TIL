package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class InsertTest {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO c = new CustVO("id06", "한길동", "파주시", null, "pwd06");
		try {
			biz.register(c);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}

 }
}
