package com.nader.aria.infintyProject.model.phonebook;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;


import com.nader.aria.infintyProject.model.abstracts.BaseEntity;

@Entity
@Table(name="GROUPS")
public class Group extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getDescripition() { return description; }
	public void setDescription(String description) { this.description = description;}
	


}
