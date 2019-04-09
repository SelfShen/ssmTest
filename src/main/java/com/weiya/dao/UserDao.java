package com.weiya.dao;

import java.util.List;

import com.weiya.model.User;

/* @Author=“wangShen"
 * 进行用户的增删改查
 * */
public interface UserDao {
	
	/*
	 * 添加用户
	 * */
	public void addUser(User user);
	
	/*
	 * 根据用户ID查询用户
	 * */
	public User findUserById(Integer Id);
	
	/*
	 * 查询所有用户
	 * */
	public List<User> findAllUser();
	
	/*
	 * 根据ID删除用户
	 * */
	public void deleteUserById(Integer Id);
	
	/*
	 * 根据ID修改用户
	 */
	public void modifyUserById(Integer Id);
}
