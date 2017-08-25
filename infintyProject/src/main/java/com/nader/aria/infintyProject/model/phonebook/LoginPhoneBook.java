package com.nader.aria.infintyProject.model.phonebook;

import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.account.Login;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name="LOGIN_PHONE_BOOKS")
public class LoginPhoneBook extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@OneToOne( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.EAGER )
	@Column(name="LOGIN_ID")
	private Login login;
	
	@OneToMany( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.LAZY )
	private List<PhoneBook> phoneBooks;
	
	public Login getLogin() { return login; }
	public void setLogin(Login login) { this.login = login; }
	
	public List<PhoneBook> getPhoneBooks(){ return phoneBooks; }
	public void setPhoneBook(List<PhoneBook> phoneBooks) { this.phoneBooks = phoneBooks; }
	


}
