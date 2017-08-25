package com.nader.aria.infintyProject.model.account;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.enums.Gender;

@Entity
@Table(name="USERS")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn( name="USER_TYPE",discriminatorType = DiscriminatorType.STRING )
public class User extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	@Column(name="GENDER")
	private Gender gender;
	
	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DAY")
	private Calendar birthDay;
	
	@OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.EAGER)
	@Column(name="ADDRESS_ID")
	private Address address;
	
	@OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.EAGER)
	@Column(name="CALL_INFO_ID")
	private CallInfo callInfo;
	
	@Lob
	@Column(name="IMAGE")
	private byte[] image;
	
	
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	
	public Gender getGender() { return gender; }
	public void setGender(Gender gender) { this.gender = gender; }
	
	public Calendar getBirthDay() { return birthDay; }
	public void setBirthDay(Calendar birthDay) { this.birthDay = birthDay; }
	
	public Address getAddress() { return address; }
	public void setAddress(Address address) { this.address = address; }
	
	public CallInfo getCallInfo() { return callInfo; }
	public void setCallInfo(CallInfo callInfo) { this.callInfo = callInfo; }
	
	public byte[] getImage() { return image; }
	public void setImage(byte[] image) { this.image = image; }
	
	
			
			
			

}
