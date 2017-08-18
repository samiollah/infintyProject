package com.nader.aria.infintyProject.model.enums;

public enum Gender {
	
	MAN(1),
	WOMAN(2),
	OTHER(3);
	
	private int no;
	
	public int getNo() { return no; }
	
	private Gender(int no) { this.no = no; }

}
