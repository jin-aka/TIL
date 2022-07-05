package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class InsertTest {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		CateVO c = new CateVO(80, "etc", 0);
		try {
			biz.register(c);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}

 }
}
