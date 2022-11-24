package com.bitacademy.container.videosystem;

public class DVDPlayer {
	private DigitalVideoDisc dvd;
	
	// 생성자 주입
	public DVDPlayer() {
		
	}
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	

	public DigitalVideoDisc getDvd() {
		return dvd;
	}
	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	
	public String play() {
		return dvd.play();
	}
}
