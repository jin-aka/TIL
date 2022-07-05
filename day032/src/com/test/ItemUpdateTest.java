package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemUpdateTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer, ItemVO> service =
				(Service<Integer, ItemVO>) factory.getBean("iservice");
				
		ItemVO i = new ItemVO(1006,"bluejeans",59000,"bluejeans01");
		try {
			service.modify(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
