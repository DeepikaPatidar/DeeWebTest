package com.manager;

import org.openqa.selenium.WebDriver;

import com.pageobject.HomePage;
import com.pageobject.TextBoxPage;


public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homePage;
	private TextBoxPage textBoxPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homePage==null)? new HomePage(driver) : homePage;
	}
	
	public TextBoxPage getTextBoxPage() {
		return (textBoxPage==null)? new TextBoxPage(driver) : textBoxPage;
	}
}
