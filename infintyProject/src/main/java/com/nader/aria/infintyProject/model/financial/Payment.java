package com.nader.aria.infintyProject.model.financial;


import com.nader.aria.infintyProject.model.enums.PayType;

public class Payment extends Financial {

	
	private static final long serialVersionUID = 1L;
	
	
	private boolean payed;
	
	private PayType payType;
	
	private String seller;
	
	
	public boolean isPayed() { return payed; }
	public void setPayed(boolean payed) { this.payed = payed; }
	
	public PayType getPayType() { return payType; }
	public void setPayType(PayType payType) { this.payType = payType; }
	
	public String getSeller() { return seller; }
	public void setSeller(String seller) { this.seller = seller; }
	

}
