package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.vo.CustVO;

@SpringBootTest
class CustTests {

	@Test
	void contextLoads() {
		CustVO cust = new CustVO("id01", "pwd01", "lee");
		System.out.println(cust);
		System.out.println(cust.getName());
	}

}
