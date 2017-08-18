package com.nader.aria.infintyProject.model.phonebook;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

public class Group extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String description;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getDescripition() { return description; }
	public void setDescription(String description) { this.description = description;}
	


}
