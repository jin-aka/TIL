package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;

public class ProductInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer,ProductVO> service =
				(Service<Integer, ProductVO>) factory.getBean("pservice");
		
		ProductVO u = new ProductVO("pants05",10000,11);
		try {
			service.register(u);
		} catch (Exception e) {
			System.out.println("입력오류가 발생하였습니다(insert값 중복)");
			//e.printStackTrace();
		}
	}

}
