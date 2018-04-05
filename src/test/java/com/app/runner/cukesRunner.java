package com.app.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin="html:target/cucumber",
    	features="./src/test/resources/features",
    	glue="com.app.stepDefs",
    	tags= {"@smokeTest"}
//		dryRun=true
)
public class cukesRunner extends AbstractTestNGCucumberTests {

	
	
}
