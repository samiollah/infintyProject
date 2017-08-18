package com.nader.aria.infintyProject.model.phonebook;



import java.util.List;

import com.nader.aria.infintyProject.model.account.User;

public class UserContact extends User {

	private static final long serialVersionUID = 1L;
	
	private String description;
	
	private List<Contact> contacts;
	
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	public List<Contact> getContacts(){ return contacts; }
	public void setContacts(List<Contact> contacts) { this.contacts = contacts; }
	
	
	

}
