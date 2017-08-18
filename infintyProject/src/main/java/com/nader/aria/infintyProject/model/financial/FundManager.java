package com.nader.aria.infintyProject.model.financial;

import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.account.Login;

public class FundManager extends BaseEntity {


	private static final long serialVersionUID = 1L;

	private Login login;
	
	private List<Fund> funds;
	
	
	public Login getLogin() { return login; }
	public void setLogin(Login login) { this.login = login; }
	
	public List<Fund> getFunds(){ return funds; }
	public void setFund(List<Fund> funds) { this.funds = funds; }
	
}
