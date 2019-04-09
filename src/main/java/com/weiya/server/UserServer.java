package com.weiya.server;

import java.util.List;

import com.weiya.model.User;

/*
 * @Author="wangShen"
 * describe:�û�ģ����߼�ҵ����ӿ�
 */
public interface UserServer {
	/*
	 * ����û�
	 * */
	public void addUser(User user);
	
	/*
	 * �����û�ID��ѯ�û�
	 * */
	public User findUserById(Integer Id);
	
	/*
	 * ��ѯ�����û�
	 * */
	public List<User> findAllUser();
	
	/*
	 * ����IDɾ���û�
	 * */
	public void deleteUserById(Integer Id);
	
	/*
	 * ����ID�޸��û�
	 */
	public void modifyUserById(Integer Id);
}
