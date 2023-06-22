package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftMenuPage extends BasePage {
	WebDriver driver;
	
	public LeftMenuPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(css = ".accordion > div:nth-child(1) #item-0")
	WebElement textBox;
	
	@FindBy(css = ".accordion > div:nth-child(1) #item-3")
	WebElement webTableCard;
	
	@FindBy(css = ".accordion > div:nth-child(1) #item-4")
	WebElement buttonsMenu;
	
	public void clickTextBox() {
		scrollAndClick(textBox);
	}
	
	public void clickWebTableCard() {
		scrollAndClick(webTableCard);
	}
	
	public void clickButtonMenu() {
		scrollAndClick(buttonsMenu);
	}

}
