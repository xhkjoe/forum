package com.forum.action;

import com.forum.dao.UserDao;
import com.forum.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private String name;	
	private String pwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String login(){
		if(this.name.isEmpty()||this.pwd.isEmpty()){
			return "index";
		}else {
			try{
				System.out.println(name);
			this.userService.loginTest(this.name,this.pwd);
			}
			catch(Exception e){e.printStackTrace();}
			return "index";
		}
	}

}
