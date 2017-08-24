package com.nader.aria.infintyProject.model.life;



import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.Calendar;
import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.enums.StateType;

@Entity
@Table(name="SPRINTS")
public class Sprint extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER)
	@Column(name="AIM_ID")
	private Aim aim;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="CODE")
	private String code;
	
	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Calendar startDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Calendar endDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="STATE_TYPE")
	private StateType stateType;
	
	@OneToMany( cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	private List<Task> tasks;
	
	
	public Aim getAim() { return aim; }
	public void setAim(Aim aim) { this.aim = aim; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getCode() { return code; }
	public void setCode(String code) { this.code = code; }
	
	public Calendar getStartDate() { return startDate; }
	public void setStartDate(Calendar startDate) { this.startDate = startDate; }
	
	public Calendar getEndDate() { return endDate; }
	public void setEndDate(Calendar endDate) { this.endDate = endDate; }
	
	public StateType getStateType() { return stateType; }
	public void setStateType(StateType stateType) { this.stateType = stateType; }
	
	public List<Task> getTasks(){ return tasks; }
	public void setTasks(List<Task> tasks) { this.tasks = tasks; }
}
