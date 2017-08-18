package com.nader.aria.infintyProject.model.account;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public class Address extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	private String country;
	
	private String city;
	
	private String line;
	
	private String alley;
	
	private String fullAddress;
	
	private int no;
	
	public  String getCountry() { return country; }
	public void setCountry(String country) { this.country = country; }
	
	public String getCity() { return city; }
	public void setCity(String city) { this.city = city; }
	
	public String getLine() { return line; }
	public void setLine(String line) { this.line = line; }
	
	public String getAlley() { return alley; }
	public void setAlley(String alley) { this.alley = alley; }
	
	public String getFullAddress() { return fullAddress; }
	public void setFullAddress( String fullAddress) { this.fullAddress = fullAddress; }
	
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
}
