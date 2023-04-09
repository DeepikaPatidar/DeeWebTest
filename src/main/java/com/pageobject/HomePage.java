package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	WebDriver driver;
	
	@FindBy(css = ".accordion > div:nth-child(3) #item-1")
	WebElement textBox;
	
	@FindBy(xpath = "//div[@id='app']/div/div/div/div/div[1]")
	WebElement elements;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void clickElement() {
		click(elements);
	}
	
	public void clickTextBox() {
		click(textBox);
	}
	
	public void openHomePage() {
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
	}


}
