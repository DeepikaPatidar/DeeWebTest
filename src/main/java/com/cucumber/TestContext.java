package com.cucumber;

import com.manager.PageObjectManager;
import com.manager.WebDriverManager;

public class TestContext {
	
	private PageObjectManager pageObjectManager;
	private WebDriverManager webDriverManager;

	public TestContext () {
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	public WebDriverManager getwebDriverManager() {
		return webDriverManager;
	}
}
