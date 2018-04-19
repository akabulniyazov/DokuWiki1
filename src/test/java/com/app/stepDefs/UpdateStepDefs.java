package com.app.stepDefs;

import com.app.pages.homePage;
import com.app.pages.loginPage;
import com.app.utilities.configuration;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class UpdateStepDefs {
	
	homePage h=new homePage();
	
	
	@Then("^user update password to \"([^\"]*)\"$")
	public void user_update_password_to(String arg1) throws InterruptedException {
	
	h.updateProfile.click();
	Thread.sleep(3000);
	h.newPass.sendKeys(arg1);
	h.onceAgain.sendKeys(arg1);
	h.oldPass.sendKeys("abc123");
	h.saveUpdate.click();
	Thread.sleep(4000);
	h.logOut.click();
	h.logIn.click();
	loginPage loginpage=new loginPage();
    loginpage.Username.sendKeys(configuration.getPropertyValue("username"));
    loginpage.Password.sendKeys(arg1);
    Thread.sleep(3000);
    loginpage.logIn.click();
    Thread.sleep(3000);
	
	 
	}

}