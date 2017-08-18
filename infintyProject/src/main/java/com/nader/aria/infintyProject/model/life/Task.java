package com.nader.aria.infintyProject.model.life;

import java.util.Calendar;
import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.enums.PriorityType;
import com.nader.aria.infintyProject.model.enums.StateType;
import com.nader.aria.infintyProject.model.enums.TaskType;
import com.nader.aria.infintyProject.model.financial.Financial;
import com.nader.aria.infintyProject.model.reminder.Reminder;

public class Task extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	
	private Sprint sprint;
	
	private String title;
	
	private String description;
	
	private String code;
	
	private PriorityType priorityType;
	
	private TaskType taskType;
	
	private StateType stateType;
	
	private Calendar timePrediction;//پیش بینی زمان
	
	private Calendar logWork;
	
	private Financial financial;
	
	private Reminder reminder;
	
	private List<Task> dependencies;
	
	public Sprint getSprint() { return sprint; }
	public void setSprint(Sprint sprint) { this.sprint = sprint; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	
	public String getCode() { return code; }
	public void setCode(String code) { this.code = code; }
	
	public PriorityType getPriorityType() { return priorityType; }
	public void setPriorityType(PriorityType priorityType) { this.priorityType = priorityType; }
	
	public TaskType getTaskType() { return taskType; }
	public void setTaskType(TaskType taskType) { this.taskType = taskType; }
	
	public StateType getStateType() { return stateType; }
	public void setStateType(StateType stateType) { this.stateType = stateType; }
	
	
	public Calendar getTimePrediction() { return timePrediction; }
	public void setTimePrediction(Calendar timePrediction) { this.timePrediction = timePrediction; }
	
	public Calendar getLogWork() { return logWork; }
	public void setLogWork(Calendar logWork) { this.logWork = logWork; }
	
	public Financial getFinancial() { return financial; }
	public void setFinancial(Financial financial) { this.financial = financial; }
	
	
	public Reminder getReminder() { return reminder; }
	public void setReminder(Reminder reminder) { this.reminder = reminder; }
	
	public List<Task> getDependencies(){ return dependencies; }
	public void setDependencies(List<Task> dependencies) { this.dependencies = dependencies; }
	
	
	
	
}
