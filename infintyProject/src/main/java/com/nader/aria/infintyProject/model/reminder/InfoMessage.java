package com.nader.aria.infintyProject.model.reminder;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;



@Entity
@DiscriminatorValue("INFO_MESSAGE")
public class InfoMessage extends Message {

	private static final long serialVersionUID = 1L;

}
