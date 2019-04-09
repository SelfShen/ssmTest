package com.weiya.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weiya.dao.UserDao;
import com.weiya.model.User;
import com.weiya.server.UserServer;

/*
 * @Author="wangShen"
 * describe:用户模块的业务实现层
 */
@Service
public class UserServerImpl implements UserServer {
	
	@Autowired
	private UserDao userDao;
	
	public User findUserById(Integer Id) {
		User user=userDao.findUserById(Id);
		return user;
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		List<User> user=userDao.findAllUser();
		return user;
	}

	public void deleteUserById(Integer Id) {
		// TODO Auto-generated method stub
		userDao.deleteUserById(Id);
	}

	public void modifyUserById(Integer Id) {
		// TODO Auto-generated method stub
		userDao.modifyUserById(Id);
	}

}
