package com.nader.aria.infintyProject.model.phonebook;


import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


import java.util.List;

import com.nader.aria.infintyProject.model.account.User;

@Entity
@DiscriminatorValue("USER_CONTACT")
public class UserContact extends User {

	private static final long serialVersionUID = 1L;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@OneToMany( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.LAZY )
	private List<Contact> contacts;
	
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	public List<Contact> getContacts(){ return contacts; }
	public void setContacts(List<Contact> contacts) { this.contacts = contacts; }
	
	
	

}
