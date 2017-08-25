package com.nader.aria.infintyProject.model.phonebook;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.account.Address;

@Entity
@Table(name="CONTACTS" ,  uniqueConstraints = @UniqueConstraint( columnNames= {"type","phone","userContact"}) )
public class Contact extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="PHONE")
	private String phone;
	
	@OneToOne( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.EAGER )
	@Column(name="ADDRESS_ID")
	private Address address;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@OneToOne( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.EAGER )
	@Column(name="USER_CONTACT_ID")
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
