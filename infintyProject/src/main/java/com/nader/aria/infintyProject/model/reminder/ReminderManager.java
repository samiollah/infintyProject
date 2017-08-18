package com.nader.aria.infintyProject.model.reminder;

import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.account.Login;

public class ReminderManager extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private Login login;
	
	private List<Reminder> reminders;
	
	public Login getLogin() { return login; }
	public void setLogin(Login login) { this.login = login; }
	
	public List<Reminder> getReminders(){ return reminders; }
	public void setReminders(List<Reminder> reminders) { this.reminders = reminders; }
	
	
}
