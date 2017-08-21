package com.nader.aria.infintyProject.model.account;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.enums.Gender;

@Entity
@Table(name="USERS")
public class User extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	
	private String lastName;
	
	private Gender gender;
	
	private Calendar birthDay;
	
	private Address address;
	
	private CallInfo callInfo;
	
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
