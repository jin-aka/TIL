package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO c = new CustVO("id03", "최길동", "광주시", null, "pwd03");
		try {
			biz.modify(c);
			System.out.println("updated");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
