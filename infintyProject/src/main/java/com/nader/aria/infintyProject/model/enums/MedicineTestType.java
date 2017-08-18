package com.nader.aria.infintyProject.model.enums;

public enum MedicineTestType {

	BLOOD_SUGAR(1),
	BLOOD_PRESSURE(2);
	
	private int no;
	
	public int getNo() { return no; }
	
	private MedicineTestType(int no) { this.no = no; }
}
