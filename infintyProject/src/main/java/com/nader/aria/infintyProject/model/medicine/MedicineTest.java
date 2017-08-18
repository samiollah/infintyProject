package com.nader.aria.infintyProject.model.medicine;

import com.nader.aria.infintyProject.model.enums.MedicineTestType;
import com.nader.aria.infintyProject.model.life.Task;

public class MedicineTest extends Task {

	private static final long serialVersionUID = 1L;
	
	private String value;
	
	private String normalValue;
	
	private boolean relatedDiseases;
	
	private MedicineTestType medicineTestType;

	public String getValue() { return value; }
	public void setValue(String value) { this.value = value; }

	public String getNormalValue() { return normalValue; }
	public void setNormalValue(String normalValue) { this.normalValue = normalValue; }

	public boolean isRelatedDiseases() { return relatedDiseases; }
	public void setRelatedDiseases(boolean relatedDiseases) { this.relatedDiseases = relatedDiseases; }

	public MedicineTestType getMedicineTestType() { return medicineTestType; }
	public void setMedicineTestType(MedicineTestType medicineTestType) { this.medicineTestType = medicineTestType; }

	
	
	

}
