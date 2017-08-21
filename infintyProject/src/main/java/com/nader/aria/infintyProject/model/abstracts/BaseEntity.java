package com.nader.aria.infintyProject.model.abstracts;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	private int id;
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

}
