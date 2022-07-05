package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemDeleteTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer, ItemVO> service =
				(Service<Integer, ItemVO>) factory.getBean("iservice");
				
		try {
			service.remove(1005);
		} catch (Exception e) {
			System.out.println("시스템 장애");
			//e.printStackTrace();
		}
		
	}
}
