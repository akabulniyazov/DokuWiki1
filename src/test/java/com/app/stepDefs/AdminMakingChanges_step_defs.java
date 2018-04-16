package com.app.stepDefs;


import org.testng.Assert;

import com.app.pages.homePage;
import com.app.pages.loginPage;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminMakingChanges_step_defs {
	
	loginPage loginpage=new loginPage();
	homePage hm = new homePage();
	
	
	@When("^User log in as User username \"([^\"]*)\" password \"([^\"]*)\"$")
	public void user_log_in_as_User_username_password(String username, String password) {
	    loginpage.loginButton.click();
	    loginpage.login(username, password);
	}

	@Then("^User writes \"([^\"]*)\" inside \"([^\"]*)\" link$")
	public void user_writes_inside_link(String textToPost, String link) {
		hm.sitemap.click();
		hm.clickOnLink(link, hm.listOfLinks);
		hm.EditThisPage.click();
		hm.textArea.clear();
		hm.textArea.sendKeys(textToPost);
		hm.saveButton.click();
	}

	@Then("^User verify in Old revisions that change made by \"([^\"]*)\"$")
	public void user_verify_in_Old_revisions_that_change_made_by(String arg1) {
		hm.oldRevision.click();
		Assert.assertEquals(hm.verifyUserInOldRevision.getText(), arg1, "user name and displayed name did not match");

	}

}
