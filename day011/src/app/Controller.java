package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import frame.TV;

public class Controller {

	public static void main(String[] args) {
		System.out.println("App Start ....");// 프로그램실행
		
		System.out.println("Spring Start ..");//스프링환경실행
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");//스프링환경실행with xml(안의 stv,ltv로 객체 생성)
		
		TV tv = (TV) factory.getBean("ss"); //lg or ss객체 호출(spring)에게
		tv.on();
		tv.off();
				
		System.out.println("App End ....");
	}

}
