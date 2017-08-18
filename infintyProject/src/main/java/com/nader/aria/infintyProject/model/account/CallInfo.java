package com.nader.aria.infintyProject.model.account;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public class CallInfo extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	private String site;
	
	private String email;
	
	private String phone;
	
	private String cell;
	
	public String getSite() { return site; }
	public void setSite(String site) { this.site = site; }
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }
	
	public String getCell() { return cell; }
	public void setCell( String cell) { this.cell = cell; }
	
	

}
