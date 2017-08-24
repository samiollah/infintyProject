package com.nader.aria.infintyProject.model.phonebook;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

@Entity
@Table(name ="PHONE_BOOK")
public class PhoneBook extends BaseEntity {


	private static final long serialVersionUID = 1L;
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name="GROUP_ID")
	private Group group;
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name="USER_CONTACT_ID")
	private UserContact userContact;
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name="LOGIN_PHONE_BOOK_ID")
	private LoginPhoneBook loginPhoneBook;
	
	
	public Group getGroup() { return group; }
	public void setGroup(Group group) { this.group = group; }
	
	public UserContact getUserContact() { return userContact; }
	public void setUserContact(UserContact userContact) { this.userContact = userContact; }
	
	public LoginPhoneBook getLoginPhoneBook() { return loginPhoneBook; }
	public void setLoignPhoneBook(LoginPhoneBook loginPhoneBook) { this.loginPhoneBook = loginPhoneBook; }


}
