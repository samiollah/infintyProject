package com.nader.aria.infintyProject.model.life;

import java.util.Calendar;
import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.enums.StateType;

public class Sprint extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private Aim aim;
	
	private String title;
	
	private String code;
	
	private Calendar startDate;
	
	private Calendar endDate;
	
	private StateType stateType;
	
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
