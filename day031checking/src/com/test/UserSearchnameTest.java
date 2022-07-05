package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;
import com.vo.UserVO;

public class UserSearchnameTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
//		Service<Integer,ProductVO> service = 
//				(Service<Integer, ProductVO>) factory.getBean("uservice");
		
		UserService service  =
				(UserService) factory.getBean("uservice");
		
		
		List<UserVO> list = null;
		try {
			list = service.searchname("¸»");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (UserVO vo : list) {
			System.out.println(vo);
		}

	}
}

