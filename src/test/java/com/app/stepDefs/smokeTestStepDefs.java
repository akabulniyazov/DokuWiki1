package com.app.stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.app.pages.homePage;
import com.app.pages.loginPage;
import com.app.utilities.browser;
import com.app.utilities.configuration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTestStepDefs {
	//git test
	//master
	WebDriver driver=browser.getDriver();
	
	@Given("^User navigates DokuWiki$")
	public void user_navigates_DokuWiki() {
		driver.get(configuration.getPropertyValue("url"));
	}

	@When("^User log in as Admin username \"([^\"]*)\" password \"([^\"]*)\"$")
	public void user_log_in_as_Admin_username_password(String arg1, String arg2) {
	    loginPage loginpage=new loginPage();
	    loginpage.loginButton.click();
	    loginpage.login(configuration.getPropertyValue("username"), configuration.getPropertyValue("password"));
	    
	}

	@When("^User open new file and post \"([^\"]*)\"$")
	public void user_open_new_file_and_post(String arg1) {
		homePage homepage=new homePage();
		homepage.CreateThisPage.click();
		homepage.textArea.sendKeys(arg1);
		homepage.saveButton.click();
	}

	@Then("^User verify if text is posted$")
	public void user_verify_if_text_is_posted() {
	   homePage homepage=new homePage();
	  Assert.assertEquals(homepage.textBody.getText(), "Smoke test is done!");
	}

	@Then("^User deletes the post$")
	public void user_deletes_the_post() {
		 homePage homepage=new homePage();
		 homepage.EditThisPage.click();
		 homepage.textArea.clear();
		 homepage.saveButton.click();
	}

	@Then("^User log out$")
	public void user_log_out() {
		homePage homepage=new homePage();
		homepage.logOut.click();
	}

}
