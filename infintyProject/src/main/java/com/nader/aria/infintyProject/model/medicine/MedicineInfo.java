package com.nader.aria.infintyProject.model.medicine;

import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.account.Address;
import com.nader.aria.infintyProject.model.account.CallInfo;
import com.nader.aria.infintyProject.model.enums.MedicineType;

public class MedicineInfo extends BaseEntity {

	private static final long serialVersionUID = 1L;

	
	private String title;
	private String description;
	private Address address;
	private CallInfo callInfo;
	private MedicineType medicineType;
	private List<DrugInfo> drugInfoes;
	
	public String getTitle() { return title;}
	public void setTitle(String title) { this.title = title; }
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	public Address getAddress() { return address; }
	public void setAddress(Address address) { this.address = address; }
	
	public CallInfo getCallInfo() { return callInfo; }
	public void setCallInfo(CallInfo callInfo) { this.callInfo = callInfo; }
	
	public MedicineType getMedicineType() { return medicineType; }
	public void setMedicineType(MedicineType medicineType) { this.medicineType = medicineType; }
	
	public List<DrugInfo> getDrugInfoes() { return drugInfoes; }
	public void setDrugInfoes(List<DrugInfo> drugInfoes) { this.drugInfoes = drugInfoes; }
	

}
