package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class SelectTest {
	
	@Autowired
	CateBiz biz;

	@Test
	void contextLoads() {
		CateVO c = null;
		try {
			c = biz.get(40);
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
