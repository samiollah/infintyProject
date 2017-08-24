package com.nader.aria.infintyProject.model.medicine;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;


import com.nader.aria.infintyProject.model.enums.MedicineTestType;
import com.nader.aria.infintyProject.model.life.Task;

@Entity
@DiscriminatorValue("MEDICINE_TEST")
public class MedicineTest extends Task {

	private static final long serialVersionUID = 1L;
	
	@Column(name="VALUE")
	private String value;
	
	@Column(name="NORMAL_VALUE")
	private String normalValue;
	
	@Column(name="RELATED_DISEASES")
	private boolean relatedDiseases;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MEDICINE_TEST_TYPE")
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
