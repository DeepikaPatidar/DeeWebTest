package com.manager;

import org.openqa.selenium.WebDriver;

import com.pageobject.ButtonsPage;
import com.pageobject.HomePage;
import com.pageobject.LeftMenuPage;
import com.pageobject.TextBoxPage;
import com.pageobject.WebTablePage;


public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homePage;
	private TextBoxPage textBoxPage;
	private WebTablePage webTablePage;
	private ButtonsPage buttonsPage;
	private LeftMenuPage leftMenuPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homePage==null)? new HomePage(driver) : homePage;
	}
	
	public TextBoxPage getTextBoxPage() {
		return (textBoxPage==null)? new TextBoxPage(driver) : textBoxPage;
	}
	
	public WebTablePage getWebTablePage() {
		return (webTablePage==null)? new WebTablePage(driver) : webTablePage; 
	}
	
	public ButtonsPage getButtonsPage() {
		return (buttonsPage == null ? new ButtonsPage(driver) : buttonsPage);
	}
	
	public LeftMenuPage getLeftMenuPage() {
		return (leftMenuPage == null ? new LeftMenuPage(driver) : leftMenuPage);
	}
}
