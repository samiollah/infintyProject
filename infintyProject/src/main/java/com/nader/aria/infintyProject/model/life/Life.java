package com.nader.aria.infintyProject.model.life;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.account.Login;

@Entity
@Table(name="LIFES")
public class Life extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name ="LoGIN_ID" )
	private Login login;
	
	@OneToMany( cascade = CascadeType.ALL ,fetch = FetchType.LAZY )
	private List<Aim> aims;
	
	public Login getLogin() { return login; }
	public void setLogin(Login login) { this.login = login; }
	
	public List<Aim> getAims(){ return aims; }
	public void setAims(List<Aim> aims) { this.aims = aims; }
	
}
