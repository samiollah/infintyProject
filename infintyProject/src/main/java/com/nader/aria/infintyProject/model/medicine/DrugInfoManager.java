package com.nader.aria.infintyProject.model.medicine;

import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.account.Login;

public class DrugInfoManager extends BaseEntity {


	private static final long serialVersionUID = 1L;
	
	private Login login;
	
	private List<DrugInfo> drugInfos;
	
	
	public Login getLogin() { return login; }
	public void setLogin(Login login) { this.login = login; }
	
	public List<DrugInfo> getDrugInfos(){ return drugInfos; }
	public void setDrugInfo(List<DrugInfo> drugInfos) { this.drugInfos =drugInfos; }
	
	

}
