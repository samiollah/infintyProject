package com.nader.aria.infintyProject.model.medicine;

import java.util.Calendar;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public class DrugInfo extends BaseEntity {


	private static final long serialVersionUID = 1L;
	
	
	private DrugInfoManager drugInfoManager;
	
	private MedicineInfo medicineInfo;
	
	private String title;
	
	private Calendar startDate;
	
	private Calendar endDate;
	
	private Calendar useTime;
	
	private String description;
	
	private String complications;
	
	private boolean consumed;
	
	private boolean active;

	public DrugInfoManager getDrugInfoManager() { return drugInfoManager; }
	public void setDrugInfoManager(DrugInfoManager drugInfoManager) { this.drugInfoManager = drugInfoManager; }

	public MedicineInfo getMedicineInfo() {	return medicineInfo; }
	public void setMedicineInfo(MedicineInfo medicineInfo) { this.medicineInfo = medicineInfo; }

	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }

	public Calendar getStartDate() { return startDate; }
	public void setStartDate(Calendar startDate) { this.startDate = startDate; }

	public Calendar getEndDate() { return endDate; }
	public void setEndDate(Calendar endDate) { this.endDate = endDate; }

	public Calendar getUseTime() { return useTime; }
	public void setUseTime(Calendar useTime) { this.useTime = useTime; }

	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }

	public String getComplications() { return complications; }
	public void setComplications(String complications) { this.complications = complications; }

	public boolean isConsumed() { return consumed; }
	public void setConsumed(boolean consumed) { this.consumed = consumed; }
	
	public boolean isActive() { return active; }

	public void setActive(boolean active) { this.active = active; } 
	
	
}
