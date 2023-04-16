package com.steps;

import com.cucumber.TestContext;
import com.pageobject.WebTablePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTableSteps {
	TestContext context;
	WebTablePage webTablePage;
	
	public WebTableSteps(TestContext context) {
		
		webTablePage = context.getPageObjectManager().getWebTablePage();
	}
	
	@Given("User is on web table page")
	public void user_is_on_web_table_page() {
		
	}
	
	@When("User click Add button")
	public void user_click_add_button() {
		webTablePage.clickBtnAdd();
	}
	
	@Then("form should be open")
	public void form_should_be_open() {
		
	}

}
