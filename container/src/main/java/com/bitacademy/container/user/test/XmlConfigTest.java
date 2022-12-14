package com.bitacademy.container.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitacademy.container.user.User02;
import com.bitacademy.container.user.User01;

public class XmlConfigTest {
	public static void main(String[] args) {
		// XML Auto Configuration(Annotation Scanning)
		testApplicationContext01();
		
		// XML Bean Configuration(Explicit Configuration(명시적 빈설정,수동))
		testApplicationContext02();
	}
	
	
	
	// XML Auto Configuration(Annotation Scanning)
	private static void testApplicationContext01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bitacademy/container/config/user/applicationContext01.xml");
		
		User01 user01 = ac.getBean(User01.class);
		System.out.println(user01.getName());
		
		// Bean의 id가 자동으로 설정된다
		user01 = (User01)ac.getBean("myuser");
		System.out.println(user01.getName());
		System.out.println();
	}
	
	
	
	// XML Bean Configuration(Explicit Configuration(명시적 빈설정,수동))
	private static void testApplicationContext02() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bitacademy/container/config/user/applicationContext02.xml");
		
		User02 user = null;
		
		// id로 bean 가져오기. 수동설정은 id가 자동으로 생성안되므로 꼭 만들어줘야함
		user = (User02)ac.getBean("user01");
		System.out.println(user);
		
		// name으로 bean 가져오기
		user = (User02)ac.getBean("usr01");
		System.out.println(user);
		
		// Type으로 bean 가져오기
		// 1. 같은 Type의 bean이 두개 이상 있으면 Type으로 bean 가져오기는 실패한다.
		// user = ac.getBean(User01.class);
		// System.out.println(user);
		
		// 2. id + type
		user = ac.getBean("user02",User02.class);
		System.out.println(user);
		
		// 3. name + type
		user = ac.getBean("usr02",User02.class);
		System.out.println(user);
		
		
		
		// 2개의 파라미터로 생성된 bean 가져오기1
		user = ac.getBean("user03",User02.class);
		System.out.println(user);
		
		// 2개의 파라미터로 생성된 bean 가져오기2
		user = ac.getBean("user04",User02.class);
		System.out.println(user);
		
		
		
		// setter로 초기화한 bean 가져오기1
		user = ac.getBean("user05",User02.class);
		System.out.println(user);
		
		// setter로 초기화한 bean 가져오기2 (DI)
		user = ac.getBean("user06",User02.class);
		System.out.println(user);
		
		// setter로 초기화한 bean 가져오기3 (Collection 객체 - List)
		user = ac.getBean("user07",User02.class);
		System.out.println(user);
	}

}
