package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Regression", features = {"@target/failedrerun.txt"}, glue = {"com/steps"},
plugin = {})

public class FailedTestRunner extends AbstractTestNGCucumberTests{

}
