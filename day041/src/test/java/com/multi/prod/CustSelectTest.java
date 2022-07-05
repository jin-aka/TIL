package com.multi.prod;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustSelectTest {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		CustVO list = null;
		try {
			list = biz.get("id10");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}

}
