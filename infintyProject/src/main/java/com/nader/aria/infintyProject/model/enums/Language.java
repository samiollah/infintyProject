package com.nader.aria.infintyProject.model.enums;

public enum Language {

	ENGLISH(1),
	PERSIAN(2);
	
	private int no;
	
	public int getNo() { return no; }
	
	private Language(int no) { this.no = no; }
}
