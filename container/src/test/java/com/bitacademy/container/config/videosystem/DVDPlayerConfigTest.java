package com.bitacademy.container.config.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bitacademy.container.videosystem.DVDPlayer;

@ExtendWith(SpringExtension.class) // 스프링에서 돌아가는 Test언어
@ContextConfiguration(classes= {DVDPlayerConfig.class})
public class DVDPlayerConfigTest {
	// 같은 타입의 Bean이 두개 이상 있는경우
	// 설정 클래스의 Bean 생성 메소드 이름을 지정
	@Autowired
	@Qualifier("dvdPlayer01")
	private DVDPlayer dvdPlayer01;
	
	// 같은 타입의 Bean이 두개 이상 있는경우
	// 설정 클래스의 Bean 생성 메소드의 @Bean의 name속성의 값을 사용
	@Autowired
	@Qualifier("dvdPlayerTwo")
	private DVDPlayer dvdPlayer02;
	
	@Autowired
	@Qualifier("dvdPlayer03")
	private DVDPlayer dvdPlayer03;
	
	@Test
	public void testDVDPlayerNotNull() {
		assertNotNull(dvdPlayer01);
		assertNotNull(dvdPlayer02);
		assertNotNull(dvdPlayer03);
	}
	
	@Test
	public void testPlay() {
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer01.play());
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer02.play());
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer03.play());
	}
}
