package com.bitacademy.container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bitacademy.container.videosystem.DVDPlayer;
import com.bitacademy.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {
	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}
	
	// 주입(DI)하기1
	// Bean 생성 메소드를(avengers()) 직접 호출하는 방식
	// 생성자 주입
	@Bean
	public DVDPlayer dvdPlayer01() {
		return new DVDPlayer(avengers());
	}
	
	// 주입(DI)하기2 (추천!)
	// Bean 생성 메소드(dvdPlayer02())의 파라미터로 전달하는 방식 
	// 생성자 주입
	@Bean(name="dvdPlayerTwo")
	public DVDPlayer dvdPlayer02(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
	
	// 주입(DI)하기3
	// Bean 생성 메소드(dvdPlayer03())의 파라미터로 전달하는 방식 
	// Setter 주입
	@Bean
	public DVDPlayer dvdPlayer03(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer =  new DVDPlayer();
		dvdPlayer.setDvd(dvd);
		return dvdPlayer;
	}
}
