package com.runner;

import java.io.File;

import org.junit.AfterClass;

//import com.cucumber.listener.Reporter;
import com.manager.FileReaderManager;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Regression", features = {"src/test/resources"}, glue = {"com/steps"},
plugin = {"rerun:target/failedrerun.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})


public class TestRunner  extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void writeExtentReport() {
	//	Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
}


