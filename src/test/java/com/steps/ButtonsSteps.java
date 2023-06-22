package com.steps;

import com.cucumber.TestContext;
import com.pageobject.ButtonsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ButtonsSteps {
	
	TestContext testContext;
	ButtonsPage buttonsPage;
	
	public ButtonsSteps(TestContext context) {
		this.testContext = context;
		buttonsPage = testContext.getPageObjectManager().getButtonsPage();
	}
	
	@When("user clicks on Double Click button")
	public void user_clicks_on_double_click_button() {
		buttonsPage.clickBtnDoubleClick();
	}
	
	@Then("double click message should be displayed")
	public void double_click_message_should_be_displayed() {
		buttonsPage.verifyDoubleClickMsg();
	}
	
	@When("user clicks on Click button")
	public void user_clicks_on_click_button() {
		buttonsPage.clickBtnClick();
	}
	
	@Then("proper message should be displayed")
	public void proper_message_should_be_displayed() {
		buttonsPage.verifyClickMsg();
	}
	
	@When("user clicks on Right Click button")
	public void user_clicks_on_right_click_button() {
		buttonsPage.clickBtnRightClick();
	}
	
	@Then("right click message should be displayed")
	public void right_click_message_should_be_displayed() {
		buttonsPage.verifyRightClickMsg();
	}

}
