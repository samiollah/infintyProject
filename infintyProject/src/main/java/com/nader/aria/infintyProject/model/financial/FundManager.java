package com.nader.aria.infintyProject.model.financial;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.account.Login;

@Entity
@Table(name="FUND_MANAGERS")
public class FundManager extends BaseEntity {


	private static final long serialVersionUID = 1L;

	@OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} , fetch = FetchType.EAGER )
	@Column(name="Login_ID")
	private Login login;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.LAZY)
	private List<Fund> funds;
	
	
	public Login getLogin() { return login; }
	public void setLogin(Login login) { this.login = login; }
	
	public List<Fund> getFunds(){ return funds; }
	public void setFund(List<Fund> funds) { this.funds = funds; }
	
}
