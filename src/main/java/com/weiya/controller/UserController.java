package com.weiya.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.weiya.model.User;
import com.weiya.server.UserServer;

/*
 * @Author="wangShen"
 * Describe:控制器层
 */
@Controller
@RequestMapping("/weiya")
public class UserController {

	private static Logger log=LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserServer userServer;

	/*
	 * 添加用户
	 * */
	@ResponseBody
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	public String addUser(String userName,String password,int age){
		System.out.println("添加用户");
		User user=null;
		if(userName==null&&password==null&&age==0) return "error";
		user=new User();
		user.setUserId(1);
		user.setUserName(userName);
		user.setPassword(password);
		user.setAge(age);
		userServer.addUser(user);
		return "success";
	}

	/*
	 * 查询用户
	 */
	@ResponseBody
	@RequestMapping(value = "/search")
	public String searchUser(){
		System.out.println("查询用户");
		return null;
	}

	/*
	 * 修改用户
	 */
	@ResponseBody
	@RequestMapping(value = "/charge")
	public String chargeUser(int userId,String userName,String password,int age){
		System.out.println("修改用户");
		if(userId==0||userName==null||password==null||age==0) return "error";
		User user=new User();
		user.setUserId(userId);
		user.setUserName(userName);
		user.setPassword(password);
		user.setAge(age);
		Integer Id=0;
		userServer.modifyUserById(Id);
		return null;
	}

	/*
	 * 删除用户
	 */
	@RequestMapping(value = "/delete",method=RequestMethod.POST)
	public String deleteUser(Integer Id){
		System.out.println("删除用户");
		if(Id==null) return "error";
		userServer.deleteUserById(Id);
		return "success";
	}

	/*
	 * 用户登陆
	 */
	@ResponseBody
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public String login(String userName,String password){
		System.out.println("userLogin"+userName+password);
		User user=userServer.findUserById(1);
		if(user.getUserName().equals(userName)&&user.getPassword().equals(password)){
			System.out.println("login success");
			return "success";
		}
		System.out.println("login false");
		return "false";
	}

	@ResponseBody
	@RequestMapping(value = "/test2")
	public String user(){

		System.out.println("user");

		User user=userServer.findUserById(1);
		if(user!=null){
			return JSON.toJSONString(user);
		}
		log.debug("debug user:");
		//log.debug(user.toString());
		return "index";
	}

	@RequestMapping(value="/test")
	public String test(){
		//Integer id=Integer.parseInt(request.getParameter("id"));

		//		User user=null;
		//		if(id==1){
		//			user=new User();
		//			user.setUserId(id);
		//			user.setUserName("zhang san");
		//			user.setPassword("1werw");
		//			user.setAge(20);
		//		}
		//		userServer.addUser(user);

		User Iuser=userServer.findUserById(1);
		System.out.println("Iuser"+Iuser.getUserName());

		log.debug("test log debug");
		//		log.debug(user.toString());
		return "index";
	}

	/*
	 * 进入首页
	 */
	@RequestMapping(value="/home")
	public String home(){
		return "test";
	}
}
