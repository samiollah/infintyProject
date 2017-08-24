package com.nader.aria.infintyProject.model.account;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

@Entity
@Table(name="USER_NAME_PASSWORDS")
public class UserNamePassword extends BaseEntity {


	private static final long serialVersionUID = 1L;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="PASSWORD")
	private String password;
	
	public String getUserName() { return userName; }
	public void setUserName(String userName) { this.userName = userName; }
	
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }

}
