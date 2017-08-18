package com.nader.aria.infintyProject.model.phonebook;

import com.nader.aria.infintyProject.model.Address;
import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public class Contact extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	private String type;
	
	private String phone;
	
	private Address address;
	
	private String description;
	
	private UserContact userContact;

	public String getType() { return type; }
	public void setType(String type) { this.type = type; }
	
	
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }
	
	public Address getAddress() { return address; }
	public void setAddress(Address address) { this.address = address; }
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	public UserContact getUserContact() { return userContact; }
	public void setUserContact(UserContact userContact) { this.userContact = userContact; }

}
