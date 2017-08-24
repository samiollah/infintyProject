package com.nader.aria.infintyProject.model.life;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.enums.PriorityType;
import com.nader.aria.infintyProject.model.enums.StateType;
import com.nader.aria.infintyProject.model.enums.TaskType;
import com.nader.aria.infintyProject.model.financial.Financial;
import com.nader.aria.infintyProject.model.reminder.Reminder;

@Entity
@Table(name="TASKS")
@Inheritance(strategy = InheritanceType.JOINED )
@DiscriminatorColumn(name = "TASK_CHILD_TYPE" , discriminatorType = DiscriminatorType.STRING )
public class Task extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name="SPRINT_ID")
	private Sprint sprint;
	
	@Column(name ="TITLE" )
	private String title;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="CODE")
	private String code;
	
	@Enumerated( EnumType.STRING )
	@Column(name="PRIORITY_TYPE")
	private PriorityType priorityType;
	
	@Enumerated( EnumType.STRING )
	@Column(name="TASK_TYPE")
	private TaskType taskType;
	
	@Enumerated( EnumType.STRING )
	@Column(name="STATE_TYPE")
	private StateType stateType;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TIME_PREDICTION")
	private Calendar timePrediction;//پیش بینی زمان
	
	@Temporal(TemporalType.DATE)
	@Column(name="LOG_WORK")
	private Calendar logWork;
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name="FINANCIAL_ID")
	private Financial financial;
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name="REMINDER_ID")
	private Reminder reminder;
	
	@OneToMany( cascade = CascadeType.REFRESH ,fetch = FetchType.LAZY )
	private List<Task> dependencies;
	
	@ManyToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.LAZY )
	@Column(name="DEPENDENCIE_ID")
	private Task dependencie;
	
	
	
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
	
	
	public Task getDependencie() { return dependencie; }
	public void setDependencie(Task dependencie) { this.dependencie = dependencie; }
	
}
