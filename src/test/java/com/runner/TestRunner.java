package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@regression", features = {"src/test/resources"}, glue = {"com/steps"},
plugin = {})


public class TestRunner  extends AbstractTestNGCucumberTests {

}
