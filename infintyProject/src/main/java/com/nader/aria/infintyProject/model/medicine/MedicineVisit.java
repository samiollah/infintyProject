package com.nader.aria.infintyProject.model.medicine;

import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import com.nader.aria.infintyProject.model.life.Task;

@Entity
@DiscriminatorValue("MEDICINE_VISIT")
public class MedicineVisit extends Task {


	private static final long serialVersionUID = 1L;
	
	@OneToOne( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.EAGER )
	@Column(name = "MEDICINE_INTO_ID" )
	private MedicineInfo medicineInfo;
	
	public MedicineInfo getMedicineInfo() { return medicineInfo; }
	public void setMedicineInfo(MedicineInfo medicineInfo) { this.medicineInfo = medicineInfo; }

}
