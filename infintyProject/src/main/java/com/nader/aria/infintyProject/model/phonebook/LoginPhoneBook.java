package com.nader.aria.infintyProject.model.phonebook;

import java.util.List;

import com.nader.aria.infintyProject.model.Login;
import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public class LoginPhoneBook extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	private Login login;
	
	private List<PhoneBook> phoneBooks;
	
	public Login getLogin() { return login; }
	public void setLogin(Login login) { this.login = login; }
	
	public List<PhoneBook> getPhoneBooks(){ return phoneBooks; }
	public void setPhoneBook(List<PhoneBook> phoneBooks) { this.phoneBooks = phoneBooks; }
	


}
