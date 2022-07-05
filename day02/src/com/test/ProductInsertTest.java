package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;
import com.vo.UserVO;

public class ProductInsertTest {

	public static void main(String[] args) {
		// 1. springȯ�� ����
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		// 2. product service ȣ��
		Service<Integer, ProductVO> service =
				(Service<Integer, ProductVO>) factory.getBean("pservice");
		
		ProductVO p = new ProductVO(108,"pants8",4000);
		service.register(p);
	}

}
