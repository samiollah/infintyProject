package com.nader.aria.infintyProject.model.reminder;

import java.util.Calendar;
import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.enums.ReminderState;
import com.nader.aria.infintyProject.model.enums.RepetitonType;

public class Reminder extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	
	private ReminderManager reminderManager;
	
	private List<Message> messages;
	
	private RepetitonType repetitonType;
	
	private boolean repetiton;
	
	private ReminderState reminderState;
	
	private Calendar createDate;
	
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
	
	public boolean isActive() { return active; }
	public void setActive(boolean active) { this.active = active; }
	
}
