package com.app.stepDefs;

import org.openqa.selenium.WebDriver;

import com.app.utilities.browser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTestStepDefs {
	//git test
	//master
	WebDriver driver=browser.getDriver();
	
	@Given("^User navigates DokuWiki$")
	public void user_navigates_DokuWiki() {
//		driver.get();
	}

	@When("^User log in as Admin username \"([^\"]*)\" password \"([^\"]*)\"$")
	public void user_log_in_as_Admin_username_password(String arg1, String arg2) {
	    
	}

	@When("^User open new file and post \"([^\"]*)\"$")
	public void user_open_new_file_and_post(String arg1) {
	    
	}

	@Then("^User verify if text is posted$")
	public void user_verify_if_text_is_posted() {
	   
	}

	@Then("^User deletes the post$")
	public void user_deletes_the_post() {
	    
	}

	@Then("^User log out$")
	public void user_log_out() {
	    
	}

}
