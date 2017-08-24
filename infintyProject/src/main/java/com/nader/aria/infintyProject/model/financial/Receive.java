package com.nader.aria.infintyProject.model.financial;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;


import com.nader.aria.infintyProject.model.enums.ReceiveType;

@Entity
@DiscriminatorValue("RECEIVE")
public class Receive extends Financial {

	private static final long serialVersionUID = 1L;
	
	@Column(name="RECEIVED")
	private boolean received;
	
	@Enumerated(EnumType.STRING)
	@Column(name="RECEIVE_TYPE")
	private ReceiveType receiveType;
	
	@Column(name="PAYER")
	private String payer;
	
	
	public boolean isReceived() { return received; }
	public void setReceived(boolean received) { this.received = received; }
	
	public ReceiveType getReceiveType() { return receiveType; }
	public void setReceiveType(ReceiveType receiveType) { this.receiveType = receiveType;}
	
	public String getPayer() { return payer; }
	public void setPayer(String payer) { this.payer = payer; }
}
