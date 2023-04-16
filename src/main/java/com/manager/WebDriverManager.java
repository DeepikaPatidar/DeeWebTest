package com.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverManager {
	
	public static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		 return driver;
	}
	
	public static WebDriver getEdgeDriver() {
		System.setProperty("webdriver.edge.driver","G:\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("headless");
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	
//	public static WebDriver getHtmlUnitDriver() {
//		//WebDriver driver = new HTMLUnitDriver();
//		return driver;
//	}

	public static WebDriver getGeckoDriver() {
		System.setProperty("webdriver.gecko.driver","G:\\geckodriver-v0.32.1-win64\\geckodriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette",true);
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
