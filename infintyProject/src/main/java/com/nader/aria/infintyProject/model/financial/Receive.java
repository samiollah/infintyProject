package com.nader.aria.infintyProject.model.financial;

import com.nader.aria.infintyProject.model.enums.ReceiveType;

public class Receive extends Financial {

	private static final long serialVersionUID = 1L;
	
	
	private boolean received;
	
	private ReceiveType receiveType;
	
	private String payer;
	
	
	public boolean isReceived() { return received; }
	public void setReceived(boolean received) { this.received = received; }
	
	public ReceiveType getReceiveType() { return receiveType; }
	public void setReceiveType(ReceiveType receiveType) { this.receiveType = receiveType;}
	
	public String getPayer() { return payer; }
	public void setPayer(String payer) { this.payer = payer; }
}
