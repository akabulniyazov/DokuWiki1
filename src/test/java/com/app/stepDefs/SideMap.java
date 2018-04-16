package com.app.stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.app.pages.homePage;

import cucumber.api.java.en.Then;

public class SideMap {
	
	WebDriver driver;
	homePage hp = new homePage();
	
	@Then("^Verify that all pages are present in SiteMap section$")
	public void verify_that_all_pages_are_present_in_SiteMap_section() throws InterruptedException {
	   hp.sideMap.click();
	   Thread.sleep(1000);
	  hp.wiki.click();
	  Thread.sleep(2000);
	}

	@Then("^User open syntax page$")
	public void user_open_syntax_page() {
	 // hp.syntax.click();
	   
	}

	@Then("^Verify each content is described$")
	public void verify_each_content_is_described() {
	   // hp.syntaxPDisplay.isDisplayed();
	 
	}

}
