package com.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dataProviderPojos.Employee;
import com.manager.FileReaderManager;

public class WebTablePage extends BasePage {
	WebDriver driver;
	
	public WebTablePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy (css="#addNewRecordButton")
	WebElement btnadd;
	
	@FindBy (id="firstName")
	WebElement firstName;
	
	@FindBy (id= "lastName")
	WebElement lastName;
	
	@FindBy (id = "age")
	WebElement age;
	
	@FindBy (id = "salary")
	WebElement salary;
	
	@FindBy (id ="userEmail")
	WebElement email;
	
	@FindBy (id ="department")
	WebElement department;
	
	@FindBy (id = "submit")
	WebElement btnSubmit;
	
	public void clickBtnAdd() {
		scrollAndClick(btnadd);
	}
	
	public void fillEmployeeDetails() {
		List <Employee> empDetails = FileReaderManager.getInstance().getJsonReader().getEmployeeData();
		firstName.sendKeys(empDetails.get(0).firstName);
		lastName.sendKeys(empDetails.get(0).lastName);
		age.sendKeys(empDetails.get(0).age);
		salary.sendKeys(empDetails.get(0).salary);
		email.sendKeys(empDetails.get(0).email);
		department.sendKeys(empDetails.get(0).department);
	}
	
	public void submitForm() {
		click(btnSubmit);
	}

	public boolean verifyTable() {
		List <Employee> empDetails = FileReaderManager.getInstance().getJsonReader().getEmployeeData();
		List <WebElement> rows = driver.findElements(By.xpath("//div[@class='rt-table']/div[2]/div"));   
		for (int i=1; i<= rows.size() ; i++) {
			String ename = driver.findElement(By.xpath("//div[@class='rt-table']/div[2]/div[" +i+ "]")).getText();
			if(ename.contains(empDetails.get(0).firstName)) {
				return true;
			}
		}
		return false;
	}
}
