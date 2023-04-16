package com.steps;

import com.cucumber.TestContext;
import com.pageobject.TextBoxPage;

import io.cucumber.java.en.When;

public class TestBoxSteps {
	TestContext context;
	TextBoxPage textBoxPAge;
	
	public TestBoxSteps(TestContext context) {
		this.context = context;
		textBoxPAge = context.getPageObjectManager().getTextBoxPage();
	}
	
	@When("user fill the form {string} {string} {string} {string}")
	public void user_fill_the_form(String name, String email, String cadd, String padd) {
		textBoxPAge.fillForm(name, email, cadd, padd);
	}
	
	@When("click submit button")
	public void click_submit() {
		textBoxPAge.clickSubmit();
	}

}
