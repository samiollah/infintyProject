package com.nader.aria.infintyProject.model.enums;

public enum AimTimeType {
	
	SHORT_TERM(1),
	MID_TERM(2),
	LONG_TIME(3),
	IMMEDIATE(4);
	
	private int no; 
	
	public int getNo() { return no; }
	
	private AimTimeType(int no) { this.no = no; }

}
