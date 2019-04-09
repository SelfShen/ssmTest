package com.weiya.model;

public class User {
	
	private int userId;	//类型_变量名
	private String userName;
	private String password;
	private int age;
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Integer getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
