package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends BasePage{
	WebDriver driver;
	
	public TextBoxPage(WebDriver driver) {
		super(driver);
		this.driver =  driver;
	}

	public static void fillForm(String fname,String email, String cAdd, String pAdd) {
//		driver.findElement(By.id("userName")).sendKeys(fname);
//		 driver.findElement(By.id("userEmail")).sendKeys(email);
//		 driver.findElement(By.id("currentAddress")).sendKeys(cAdd);
//		 driver.findElement(By.id("permanentAddress")).sendKeys(pAdd);
		
	}

}
