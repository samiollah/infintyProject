package com.nader.aria.infintyProject.model.account;

import com.nader.aria.infintyProject.model.enums.Language;
import com.nader.aria.infintyProject.model.enums.Theme;

public class Setting {
	
	private Theme theme;
	
	private Language language;
	
	
	public Theme getTheme() { return theme; }
	public void setTheme(Theme theme) { this.theme = theme; }
	
	public Language getLanguage() { return language; }
	public void setLanguage(Language language) { this.language = language; }
}
