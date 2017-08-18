package com.nader.aria.infintyProject.model.phonebook;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public class PhoneBook extends BaseEntity {


	private static final long serialVersionUID = 1L;
	
	private Group group;
	
	private UserContact userContact;
	
	private LoginPhoneBook loginPhoneBook;
	
	
	public Group getGroup() { return group; }
	public void setGroup(Group group) { this.group = group; }
	
	public UserContact getUserContact() { return userContact; }
	public void setUserContact(UserContact userContact) { this.userContact = userContact; }
	
	public LoginPhoneBook getLoginPhoneBook() { return loginPhoneBook; }
	public void setLoignPhoneBook(LoginPhoneBook loginPhoneBook) { this.loginPhoneBook = loginPhoneBook; }


}
