package com.app.stepDefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.app.utilities.browser;

import cucumber.api.Scenario;
import cucumber.api.java.After;


public class Hooks {
	
	@After
	public void teardown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot)browser.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		
		browser.getDriver().quit();
	}

}
