package com.forum.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.forum.dao.UserDao;
import com.forum.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	public void loginTest(String name, String pwd) {
		List<User> users=this.getHibernateTemplate().find("from User u where u.UName= ? and UPassword=?",new String[]{name,pwd});
		System.out.println("hahahhh");
	}

}
