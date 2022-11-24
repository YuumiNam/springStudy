package com.bitacademy.container.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitacademy.container.user.User01;

public class XmlConfigTest {
	public static void main(String[] args) {
		// XML Auto Configuration(Annotation Scanning)
		testApplicationContext01();
		
		// XML Bean Configuration(Explicit Configuration(명시적 빈설정,수동))
//		testApplicationContext02();
	}
	
	// XML Auto Configuration(Annotation Scanning)
	private static void testApplicationContext01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bitacademy/container/config/user/applicationContext01.xml");
		
		User01 user01 = ac.getBean(User01.class);
		System.out.println(user01.getName());
		
		// Bean의 id가 자동으로 설정된다
		user01 = (User01)ac.getBean("myuser");
		System.out.println(user01.getName());
	}
	
//	// XML Bean Configuration(Explicit Configuration(명시적 빈설정,수동))
//	private static void testApplicationContext02("com/bitacademy/container/config/user/applicationContext02.xml") {
//		// TODO Auto-generated method stub
//		
//	}

}
