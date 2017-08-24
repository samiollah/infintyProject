package com.nader.aria.infintyProject.business.service.internal;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.reminder.Reminder;

public final class Event {
	
	private BaseEntity entity;
	
	private Reminder reminder;
	
	
	public BaseEntity getBaseEntity() {	return entity; }
	public void setBaseEntity(BaseEntity entity) { this.entity = entity; }
	
	
	public Reminder getReminder() { return reminder; }
	public void setReminder(Reminder reminder) { this.reminder = reminder; }
	
}
