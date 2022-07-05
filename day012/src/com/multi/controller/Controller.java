package com.multi.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multi.frame.Service;
import com.multi.user.UserService;
import com.multi.vo.UserVO;

public class Controller {

	public static void main(String[] args) {
		System.out.println("Spring Start ..");//������ȯ�����
		
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");//������ȯ�����with xml(���� uservice�� ��ü ����)
		
		// IoC (Inversion Of Control) ����� loosely coupled (���������� app, �� controller�� �־��ش�)
		// ������: Service service = new UserService();�ε� �Ʒ��� ��(�����Ŵ)
		
		Service service = (Service) factory.getBean("uservice"); // ����...?
				
		UserVO user = new UserVO("id01","pwd01","lee");
		service.register(user);
	}

}
