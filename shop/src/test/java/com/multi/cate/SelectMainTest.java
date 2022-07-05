package com.multi.cate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class SelectMainTest {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		List<CateVO> list = null;
		try {
			list = biz.getmain();
			for (CateVO catevo : list) {
				System.out.println(catevo);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
