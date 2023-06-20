package com.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.enums.DriverType;

public class WebDriverManager {
	private WebDriver driver;
	private static DriverType driverType;
	
	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowserType();
	}
	
	public WebDriver getDriver() {
		if(driver == null)
			createLocalDriver();
		return driver;
	}
	
	private WebDriver createLocalDriver() {
		switch(driverType) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
			 driver = new ChromeDriver(option);
			 return driver;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver","G:\\geckodriver-v0.32.1-win64\\geckodriver.exe");
			//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			//capabilities.setCapability("marionette",true);
			 driver = new FirefoxDriver();
			return driver;
		case EDGE:
			System.setProperty("webdriver.edge.driver","G:\\edgedriver_win64\\msedgedriver.exe");
			EdgeOptions options = new EdgeOptions();
			options.addArguments("headless");
			 driver = new EdgeDriver();
			return driver;
		}
		return driver;
	}
	
	public void quiteDriver() {
		driver.close();
	}

}
