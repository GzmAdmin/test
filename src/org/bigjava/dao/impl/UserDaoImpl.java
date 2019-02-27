package org.bigjava.dao.impl;

import org.bigjava.beans.User;
import org.bigjava.dao.UserDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	
	
}
