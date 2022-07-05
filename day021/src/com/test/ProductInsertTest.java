package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;
import com.vo.UserVO;

public class ProductInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer,ProductVO> service =
				(Service<Integer, ProductVO>) factory.getBean("pservice");
		
		ProductVO p = new ProductVO(1000,"pwd01",3000);
		service.register(p);
	}

}
