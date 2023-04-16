package com.steps;

import com.cucumber.TestContext;
import com.pageobject.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps {
	TestContext context;
	HomePage homePage;
	
	
	public HomePageSteps(TestContext context) {
		this.context = context;
		homePage = context.getPageObjectManager().getHomePage();
	}

	@Given("user is on Home Page")
	public void user_is_on_home_page() {
		homePage.openHomePage();
	}
	
	@When("user clicks on Elements")
	public void user_clicks_on_elements() {
		homePage.clickElement();
	}
	
	@When("user click on Text Box")
	public void user_click_on_text_box() {
	  homePage.clickTextBox();
	}
	
	@When("clicks on Web table card")
	public void user_click_on_web_table() {
	  homePage.clickWebTableCard();
	}
}
