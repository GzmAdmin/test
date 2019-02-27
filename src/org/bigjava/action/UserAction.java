package org.bigjava.action;

import org.bigjava.beans.User;
import org.bigjava.biz.UserBiz;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private UserBiz userBiz;
	private User user;
	
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	
	public String save(){
		userBiz.save(user);
		return "find";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
