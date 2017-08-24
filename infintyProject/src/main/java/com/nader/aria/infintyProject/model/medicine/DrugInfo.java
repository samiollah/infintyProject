package com.nader.aria.infintyProject.model.medicine;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

@Entity
@Table(name="DRUG_INFOS")
public class DrugInfo extends BaseEntity {


	private static final long serialVersionUID = 1L;
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name="DRUG_INFO_MANAGER_ID")
	private DrugInfoManager drugInfoManager;
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name="MEDICINE_INFO_ID")
	private MedicineInfo medicineInfo;
	
	@Column(name="TITLE")
	private String title;
	
	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Calendar startDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Calendar endDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="USE_TIME")
	private Calendar useTime;
	
	@Column(name="DESCTIPTION")
	private String description;
	
	@Column(name="COMPLICATIONS")
	private String complications;
	
	@Column(name="CONSUMED")
	private boolean consumed;
	
	@Column(name="ACTIVE")
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
