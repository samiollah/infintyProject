package com.nader.aria.infintyProject.model.account;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

@Entity
@Table(name="LOGINS")
public class Login extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade= CascadeType.ALL ,fetch= FetchType.EAGER)
	@Column(name="USER_ID")
	private User user;
	
	
	@OneToOne(cascade= CascadeType.ALL ,fetch= FetchType.EAGER)
	@Column(name="USER_NAME_PASSWORD_ID")
	private UserNamePassword userNamePassword;
	
	@OneToOne(cascade= CascadeType.ALL ,fetch= FetchType.EAGER)
	@Column(name="SETTING_ID")
	private Setting setting;
	
	public User getUser() { return user; }
	public void setUser(User user) { this.user = user; }
	
	public UserNamePassword getUserNamePassword() { return userNamePassword; }
	public void setUserNamePassword(UserNamePassword userNamePassword) { this.userNamePassword = userNamePassword; }
	
	public Setting getSetting() { return setting; }
	public void setSetting(Setting setting) { this.setting = setting; }

}
