package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class UserDeleteTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String,UserVO> service =
				(Service<String, UserVO>) factory.getBean("uservice");
		
		try {
			service.remove("id99");
		} catch (Exception e) {
			System.out.println("시스템 장애");
			//e.printStackTrace();
		}
		
	}
}
