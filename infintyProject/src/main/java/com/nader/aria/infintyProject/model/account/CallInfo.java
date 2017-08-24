package com.nader.aria.infintyProject.model.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

@Entity
@Table(name="CALL_INFOS")
public class CallInfo extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@Column(name="SITE")
	private String site;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="CELL")
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
