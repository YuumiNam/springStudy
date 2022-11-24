package com.bitacademy.container.user;

import org.springframework.stereotype.Component;

@Component("myuser") // id="myuser"라고 설정해줬음. 지정안했다면 user01로 자동설정
public class User01 {
	public String getName() {
		return "둘리";
	}
}
