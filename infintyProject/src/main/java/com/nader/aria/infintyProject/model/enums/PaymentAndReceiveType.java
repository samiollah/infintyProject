package com.nader.aria.infintyProject.model.enums;

public enum PaymentAndReceiveType {
	
	CHECK(1),
	CASH(2),
	INSTALLMENT(3),
	BILL(4),
	POS(5),
	GENERIC(6);
	
	private int no;
	
	public int getNo() { return no; }
	
	private PaymentAndReceiveType(int no) { this.no = no; }

}
