package com.nader.aria.infintyProject.model.reminder;


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
import com.nader.aria.infintyProject.model.enums.ReminderState;
import com.nader.aria.infintyProject.model.enums.RepetitonType;

@Entity
@Table(name="REMINDERS")
public class Reminder extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@OneToOne( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.EAGER )
	@Column(name = "REMINDER_MANAGER_ID" )
	private ReminderManager reminderManager;
	
	@OneToMany( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} ,fetch = FetchType.LAZY )
	private List<Message> messages;
	
	@Enumerated(EnumType.STRING)
	@Column(name="REPETITON_TYPE")
	private RepetitonType repetitonType;
	
	@Column(name="REPETITON")
	private boolean repetiton;
	
	@Enumerated(EnumType.STRING)
	@Column(name="REMINDER_STATE")
	private ReminderState reminderState;
	
	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Calendar createDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TIME_ACTIVETD")
	private Calendar timeActivetd;
	
	@Column(name="ACTIVE")
	private boolean active;
	
	public ReminderManager getReminderManager() { return reminderManager; }
	public void setReminderManager(ReminderManager reminderManager) { this.reminderManager = reminderManager; }
	
	public List<Message> getMessages(){ return messages; }
	public void setMessages(List<Message> messages) { this.messages = messages; }
	
	public RepetitonType getRepetitonType() { return repetitonType; }
	public void setRepetitionType(RepetitonType repetitonType) { this.repetitonType = repetitonType; }
	
	public boolean isRepetiton() { return repetiton; }
	public void setRepetiton(boolean repetiton) { this.repetiton = repetiton; }
	
	public ReminderState getReminderState() { return reminderState; }
	public void setReminderState(ReminderState reminderState) { this.reminderState = reminderState; }
	
	public Calendar getCreateDate() { return createDate; }
	public void setCreateDate(Calendar createDate) { this.createDate = createDate;}
	
	public Calendar getTimeActivetd() { return timeActivetd; }
	public void setTimeActivetd(Calendar timeActivetd) { this.timeActivetd = timeActivetd;}
	
	public boolean isActive() { return active; }
	public void setActive(boolean active) { this.active = active; }
	
}
