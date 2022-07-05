package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class UserInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String,UserVO> service =
				(Service<String, UserVO>) factory.getBean("uservice");
		
		UserVO u = new UserVO("id89","pwd89","lee");
		try {
			service.register(u);
		} catch (Exception e) {
			System.out.println("입력오류가 발생하였습니다(insert값 중복)");
			//e.printStackTrace();
		}
	}

}
