package com.bitacademy.container.user;

public class User {
	// 필드
	private Long no = 0L;
	private String name = "마이콜";
	private Friend friend;
	
	// 생성자
	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}
	
	// getter setter
	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	
	// toString
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + "]";
	}
}
