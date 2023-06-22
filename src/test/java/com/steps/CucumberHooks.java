package com.steps;


import com.cucumber.TestContext;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

	TestContext testContext;

	public CucumberHooks(TestContext context) {
		testContext = context;
	}
	
	@Before
	public void beforeHooks() {
		
	}
	
	@After
	public void afterHooks() {
		testContext.getwebDriverManager().quiteDriver();
	}
}




