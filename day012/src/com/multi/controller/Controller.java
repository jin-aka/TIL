package com.multi.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multi.frame.Service;
import com.multi.user.UserService;
import com.multi.vo.UserVO;

public class Controller {

	public static void main(String[] args) {
		System.out.println("Spring Start ..");//스프링환경실행
		
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");//스프링환경실행with xml(안의 uservice로 객체 생성)
		
		// IoC (Inversion Of Control) 제어역행 loosely coupled (스프링에서 app, 즉 controller에 넣어준다)
		// 순방향: Service service = new UserService();인데 아래로 됨(역행시킴)
		
		Service service = (Service) factory.getBean("uservice"); // 목적...?
				
		UserVO user = new UserVO("id01","pwd01","lee");
		service.register(user);
	}

}
