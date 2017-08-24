package com.nader.aria.infintyProject.business.service.internal.interfaces;

import com.nader.aria.infintyProject.business.service.internal.Event;

public interface IActiveEvent {
	
	public boolean isActived();
	
	public Event doAction();

}
