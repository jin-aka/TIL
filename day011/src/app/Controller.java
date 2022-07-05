package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import frame.TV;

public class Controller {

	public static void main(String[] args) {
		System.out.println("App Start ....");// ���α׷�����
		
		System.out.println("Spring Start ..");//������ȯ�����
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");//������ȯ�����with xml(���� stv,ltv�� ��ü ����)
		
		TV tv = (TV) factory.getBean("ss"); //lg or ss��ü ȣ��(spring)����
		tv.on();
		tv.off();
				
		System.out.println("App End ....");
	}

}
