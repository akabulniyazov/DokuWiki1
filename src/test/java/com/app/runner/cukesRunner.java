package com.app.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin="html:target/cucumber",
    	features="./src/test/resources/features",
    	glue="com.app.stepDefs",

    	tags= {"@media"},
	dryRun=false
//--------
)
public class cukesRunner extends AbstractTestNGCucumberTests {

	
	
}
