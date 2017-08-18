package com.nader.aria.infintyProject.model.life;

import java.util.List;

import com.nader.aria.infintyProject.model.abstracts.BaseEntity;
import com.nader.aria.infintyProject.model.enums.AimTimeType;
import com.nader.aria.infintyProject.model.enums.AimType;
import com.nader.aria.infintyProject.model.enums.StateType;

public class Aim extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	
	private Life life;
	
	private String title;
	
	private String code;
	
	private String description;
	
	private AimType aimType;
	
	private AimTimeType aimTimeType;
	
	private StateType stateType;
	
	private List<Sprint> sprints;
	
	
	public Life getLife() { return life; }
	public void setLife(Life life) { this.life = life; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }

	public String getCode() { return code; }
	public void setCode(String code) { this.code = code; }
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	public AimType getAimType() { return aimType; }
	public void setAimType(AimType aimType) { this.aimType = aimType; }
	
	public AimTimeType getAimTimeType() { return aimTimeType; }
	public void setAimTimeType(AimTimeType aimTimeType) { this.aimTimeType = aimTimeType; }
	
	public StateType getStateType() { return stateType; }
	public void setStateType(StateType stateType) { this.stateType = stateType; }
	
	public List<Sprint> getSprints(){ return sprints; }
	public void setSprints(List<Sprint> sprints) { this.sprints = sprints; }
}
