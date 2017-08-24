package com.nader.aria.infintyProject.model.reminder;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;


import java.util.Calendar;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

@Entity
@Table(name = "MESSAGES" )
@Inheritance(strategy = InheritanceType.JOINED )
@DiscriminatorColumn(name="MESSAGE_TYPE")
public class Message extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@OneToOne( cascade = CascadeType.REFRESH ,fetch = FetchType.EAGER )
	@Column(name="REMINDER")
	private Reminder reminder;
	
	@Column(name="TITEL")
	private String title;
	
	@Column(name="MASSAGE")
	private String message;
	
	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRATION_DATE")
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
