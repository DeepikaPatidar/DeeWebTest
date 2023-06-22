package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class ButtonsPage extends BasePage{
	WebDriver driver;

	public ButtonsPage(WebDriver driver) {
		super(driver);
		this.driver = driver ;
	}

	@FindBy(id = "doubleClickBtn")
	WebElement btnDoubleClick;
	
	@FindBy(id = "rightClickBtn")
	WebElement btnRightClick;
	
	@FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']/div[2]/div[3]/button")
	WebElement btnClick;
	
	@FindBy(id = "doubleClickMessage")
	WebElement msgDoubleClick;
	
	@FindBy(id = "rightClickMessage")
	WebElement msgRightClick;
	
	@FindBy(id = "dynamicClickMessage")
	WebElement msgDynamicClick;
	
	public void clickBtnDoubleClick() {
		doubleClick(btnDoubleClick);
	}
	
	public void clickBtnRightClick() {
		clickRightBtn(btnRightClick);
	}

	public void clickBtnClick() {
	click(btnClick);
	}
	
	public void verifyDoubleClickMsg() {
		Assert.assertEquals("You have done a double click", msgDoubleClick.getText());
	}
	
	public void verifyRightClickMsg() {
		Assert.assertEquals("You have done a right click", msgRightClick.getText());
	}
	
	public void verifyClickMsg() {
		Assert.assertEquals("You have done a dynamic click", msgDynamicClick.getText());
	}
	
}
