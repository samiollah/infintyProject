package com.nader.aria.infintyProject.model.reminder;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;


@Entity
@DiscriminatorValue("WARNING_MESSAGE")
public class WarningMessage extends Message {

	private static final long serialVersionUID = 1L;

}
