package com.app.stepDefs;

import org.testng.Assert;

import com.app.pages.AdminPage;
import com.app.pages.homePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminCreateUser_step_defs {
	homePage hm = new homePage();
	AdminPage ap = new AdminPage();

	@When("^User creates new user with credentials \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_creates_new_user_with_credentials(String user, String password, String onceAgain, String realName, String email, String groups) {
	    hm.adminButton.click();
	    ap.userManager.click();
	    ap.user.sendKeys(user);
	    ap.password.sendKeys(password);
	    ap.onceAgain.sendKeys(onceAgain);
	    ap.realName.sendKeys(realName);
	    ap.email.sendKeys(email);
	    ap.groups.sendKeys(groups);
	    ap.addButton.click();
	}

	@Then("^User validates that \"([^\"]*)\" is displayed on table$")
	public void user_validates_that_is_displayed_on_table(String userName) {
	    Assert.assertTrue(ap.verifyUserIsPresent(userName));
	}


	

}
