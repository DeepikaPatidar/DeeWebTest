package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends BasePage {
	WebDriver driver;
	
	public WebTablePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy (css="#addNewRecordButton")
	WebElement btnadd;
	
	public void clickBtnAdd() {
		scrollAndClick(btnadd);
	}

}
