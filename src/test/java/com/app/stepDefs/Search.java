package com.app.stepDefs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.app.pages.homePage;
import com.app.utilities.browser;

import cucumber.api.java.en.Then;

public class Search {
	homePage home=new homePage();
	WebDriver driver=browser.getDriver();
	@Then("^user search for \"([^\"]*)\"$")
	public void user_search_for(String message) {
	    home.searchBox.sendKeys(message+Keys.ENTER);
	}

	@Then("^user verifies all \"([^\"]*)\" related pages are displayed$")
	public void user_verifies_all_related_pages_are_displayed(String arg1) {
	    try {
	    assertTrue(driver.findElement(By.linkText(arg1)).isDisplayed());
	    }catch (Exception e) {
			System.out.println("Nothing was found");
		}
	}

	@Then("^user verifies \"([^\"]*)\" message$")
	public void user_verifies_message(String message) {
	   assertEquals(home.nothingWasFound.getText(),message);
	}
}
