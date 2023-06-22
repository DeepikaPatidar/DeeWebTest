package com.steps;

import com.cucumber.TestContext;
import com.pageobject.LeftMenuPage;

import io.cucumber.java.en.When;

public class LeftMenuSteps {
	
	TestContext testContext;
	LeftMenuPage leftMenuPage;
	
	public LeftMenuSteps(TestContext context) {
		this.testContext = context;
		leftMenuPage = testContext.getPageObjectManager().getLeftMenuPage();
	}
	
	@When("user click on Text Box")
	public void user_click_on_text_box() {
		leftMenuPage.clickTextBox();
	}
	
	@When("clicks on Web table card")
	public void user_click_on_web_table() {
		leftMenuPage.clickWebTableCard();
	}
	
	@When("clicks on Buttons menu item")
	public void clicks_on_buttons_menu_item() {
		leftMenuPage.clickButtonMenu();
	}

}
