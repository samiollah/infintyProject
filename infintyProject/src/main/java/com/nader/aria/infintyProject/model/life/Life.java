package com.nader.aria.infintyProject.model.life;

import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.account.Login;

public class Life extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private Login login;
	
	private List<Aim> aims;
	
	public Login getLogin() { return login; }
	public void setLogin(Login login) { this.login = login; }
	
	public List<Aim> getAims(){ return aims; }
	public void setAims(List<Aim> aims) { this.aims = aims; }
	
}
