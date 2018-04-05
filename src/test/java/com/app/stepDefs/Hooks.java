package com.app.stepDefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.app.pages.homePage;
import com.app.utilities.browser;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void setup(Scenario scenario) {
		System.out.println("Before scnario");
	}
	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("After scenario");
		
		if(scenario.isFailed()) {
		final byte[] screenshot =((TakesScreenshot)browser.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
		}
//		browser.getDriver().quit();
		homePage homepage=new homePage();
		
		
	}

}
