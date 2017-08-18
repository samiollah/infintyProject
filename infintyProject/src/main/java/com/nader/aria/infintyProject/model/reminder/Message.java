package com.nader.aria.infintyProject.model.reminder;

import java.util.Calendar;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public class Message extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	private Reminder reminder;
	
	private String title;
	
	private String message;
	
	private Calendar expirationDate;
	
	
	public Reminder getReminder() { return reminder; }
	public void setReminder(Reminder reminder ) { this.reminder = reminder; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getMessage() { return message; }
	public void setMessage(String message) { this.message = message; }
	
	
	public Calendar getExpirationDate() { return expirationDate; }
	public void setExpirationDate(Calendar expirationDate) { this.expirationDate = expirationDate; }
	
	

}
