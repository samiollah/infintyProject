package com.nader.aria.infintyProject.model.medicine;

import com.nader.aria.infintyProject.model.life.Task;

public class MedicineVisit extends Task {


	private static final long serialVersionUID = 1L;
	
	private MedicineInfo medicineInfo;
	
	public MedicineInfo getMedicineInfo() { return medicineInfo; }
	public void setMedicineInfo(MedicineInfo medicineInfo) { this.medicineInfo = medicineInfo; }

}
