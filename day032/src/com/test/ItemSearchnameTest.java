package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ItemService;
import com.vo.ItemVO;

public class ItemSearchnameTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
//		Service<Integer,ProductVO> service = 
//				(Service<Integer, ProductVO>) factory.getBean("iservice");
		
		ItemService service  =
				(ItemService) factory.getBean("iservice");
		
		
		List<ItemVO> list = null;
		try {
			list = service.searchname("bl");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (ItemVO vo : list) {
			System.out.println(vo);
		}

	}
}

