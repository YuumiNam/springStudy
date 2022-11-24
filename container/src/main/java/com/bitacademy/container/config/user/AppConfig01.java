package com.bitacademy.container.config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bitacademy.container.user.User02;

@Configuration
public class AppConfig01 {
	
	@Bean
	public User02 user() {
		return new User02();
	}
}
