package com.forum.service.impl;

import com.forum.dao.UserDao;
import com.forum.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void loginTest(String name, String pwd) {
		// TODO Auto-generated method stub
		this.userDao.loginTest(name,pwd);
	}

}
