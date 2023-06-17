package com.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.manager.FileReaderManager;

public class BasePage {
	private WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void click(WebElement we) {
		waitForElementToBeClickable(we);
		we.click();
	}
	
	public void sendKeys(String data, WebElement we) {
		we.sendKeys(data);
	}
	
	public void waitForElementToBeClickable(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
	}
	
	public void scrollAndClick(WebElement we) {
		scrollInToView(we);
		//we.click();
	}
	
	public void execute(String command, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(command, element);
	}
	
	public void scrollInToView(WebElement element) {
		execute("arguments[0].click();", element);
	}
}
