package org.bigjava.biz.impl;

import org.bigjava.beans.User;
import org.bigjava.biz.UserBiz;
import org.bigjava.dao.UserDao;

public class UserBizImpl implements UserBiz{

	public UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void save(User user) {
		userDao.save(user);
	}

}
