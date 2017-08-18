package com.nader.aria.infintyProject.model;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public class Login extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private User user;
	
	private UserNamePassword userNamePassword;
	
	private Setting setting;
	
	public User getUser() { return user; }
	public void setUser(User user) { this.user = user; }
	
	public UserNamePassword getUserNamePassword() { return userNamePassword; }
	public void setUserNamePassword(UserNamePassword userNamePassword) { this.userNamePassword = userNamePassword; }
	
	public Setting getSetting() { return setting; }
	public void setSetting(Setting setting) { this.setting = setting; }

}
