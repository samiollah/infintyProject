package com.nader.aria.infintyProject.model.account;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.nader.aria.infintyProject.model.enums.Language;
import com.nader.aria.infintyProject.model.enums.Theme;

@Entity
@Table(name="SETTINGS")
public class Setting {
	
	@Enumerated(EnumType.STRING)
	@Column(name="THEME")
	private Theme theme;
	
	@Enumerated(EnumType.STRING)
	@Column(name="LANGUAGE")
	private Language language;
	
	
	public Theme getTheme() { return theme; }
	public void setTheme(Theme theme) { this.theme = theme; }
	
	public Language getLanguage() { return language; }
	public void setLanguage(Language language) { this.language = language; }
}
