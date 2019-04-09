package com.weiya.server;

import java.util.List;

import com.weiya.model.User;

/*
 * @Author="wangShen"
 * describe:用户模块的逻辑业务处理接口
 */
public interface UserServer {
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
