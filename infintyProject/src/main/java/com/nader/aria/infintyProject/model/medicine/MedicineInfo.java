package com.nader.aria.infintyProject.model.medicine;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.account.Address;
import com.nader.aria.infintyProject.model.account.CallInfo;
import com.nader.aria.infintyProject.model.enums.MedicineType;

@Entity
@Table(name="MEDICINE_INFOS")
public class MedicineInfo extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name="TITLE")
	private String title;
	@Column(name="DESCRIPTION")
	
	private String description;
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name="ADDRESS_ID")
	private Address address;
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name="CALL_INFo_ID")
	private CallInfo callInfo;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MEDICINE_TYPE")
	private MedicineType medicineType;
	
	@OneToMany( cascade = CascadeType.REFRESH ,fetch = FetchType.LAZY )
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
