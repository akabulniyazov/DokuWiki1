package com.app.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {
		"pretty", 
		"html:target/cucumber-report",
		"json:target/cucumber.json" },
tags = "@reg", 
features = "src/test/resources/features/", 
glue = "com/app/stepDefs/", 
dryRun = false

)
public class RegressionTestRunner extends AbstractTestNGCucumberTests {

}
