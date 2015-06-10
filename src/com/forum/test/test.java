package com.forum.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;
import org.junit.Test;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.forum.model.User;

public class test extends HibernateDaoSupport {
@Test
public void selectUser(){

	List<User> users=new ArrayList<User>();
			users=this.getHibernateTemplate().find(" from User u");
	if(users.size()==0){

}else{
	}
}
}