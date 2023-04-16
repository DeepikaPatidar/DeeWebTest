package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage{
	WebDriver driver;
	
	@FindBy(css="#userName")
	WebElement namefield;

	@FindBy(css="#userEmail")
	WebElement emailfield;

	@FindBy(css="#currentAddress")
	WebElement currentaddfield;

	@FindBy(css="#permanentAddress")
	WebElement permnanetaddfield;
	
	@FindBy(css="#submit")
	WebElement btnSubimt;
	
	public TextBoxPage(WebDriver driver) {
		super(driver);
		this.driver =  driver;
	}

	public void fillForm(String fname,String email, String cAdd, String pAdd) {
		sendKeys(fname,namefield);
		sendKeys(email,emailfield);
		sendKeys(cAdd,currentaddfield);
		sendKeys(pAdd,permnanetaddfield);
		
	}
	
	public void clickSubmit() {
		scrollInToView(btnSubimt);
	}

}
