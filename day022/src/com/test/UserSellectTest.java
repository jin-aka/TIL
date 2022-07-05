package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class UserSellectTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String,UserVO> service =
				(Service<String, UserVO>) factory.getBean("uservice");
		
		UserVO u = null;
		u = service.get("id01");
		service.register(u);
	}

}
