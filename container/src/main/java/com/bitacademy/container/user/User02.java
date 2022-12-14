package com.bitacademy.container.user;

import java.util.List;

public class User02 {
	// 필드
	private Long no = 0L;
	private String name = "마이콜";
	private Friend friend;
	private List<String> friends;
	
	// 생성자
	public User02() {
		
	}
	
	public User02(String name) {
		this.name = name;
	}
	
	public User02(Long no, String name) {
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
	
	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	// toString
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", friends=" + friends + "]";
	}
}
