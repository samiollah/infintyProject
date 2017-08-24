package com.nader.aria.infintyProject.model.financial;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import com.nader.aria.infintyProject.model.enums.PayType;

@Entity
@DiscriminatorValue("PAYMENT")
public class Payment extends Financial {

	
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="PAYED")
	private boolean payed;
	
	@Enumerated(EnumType.STRING)
	@Column(name="PAY_TYPE")
	private PayType payType;
	
	@Column(name="SELLER")
	private String seller;
	
	
	public boolean isPayed() { return payed; }
	public void setPayed(boolean payed) { this.payed = payed; }
	
	public PayType getPayType() { return payType; }
	public void setPayType(PayType payType) { this.payType = payType; }
	
	public String getSeller() { return seller; }
	public void setSeller(String seller) { this.seller = seller; }
	

}
