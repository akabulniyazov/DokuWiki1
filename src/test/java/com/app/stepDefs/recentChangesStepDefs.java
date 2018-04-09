package com.app.stepDefs;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.app.pages.homePage;
import com.app.pages.recentChangesPage;
import com.app.utilities.configuration;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class recentChangesStepDefs {
	
	@When("^user goes to Recent changes menu$")
	public void user_goes_to_Recent_changes_menu() {
	    homePage homepage=new homePage();
	    homepage.recentChanges.click();
	}

	@Then("^user choose Pages option from dropdown$")
	public void user_choose_Pages_option_from_dropdown() {
		recentChangesPage RCpage=new recentChangesPage();
		Select select=new Select(RCpage.changesDropdown);
		select.selectByVisibleText("Pages");
	}

	@Then("^user verifies sorted list has glasses button before each file$")
	public void user_verifies_sorted_list_has_glasses_button_before_each_file() {
		recentChangesPage RCpage=new recentChangesPage();
		Assert.assertTrue(RCpage.glassesPic.getAttribute("src").equals(configuration.getPropertyValue("glassesPic")));
		
	}

	@Then("^user choose Media option from dropdown$")
	public void user_choose_Media_option_from_dropdown() {
		recentChangesPage RCpage=new recentChangesPage();
		Select select=new Select(RCpage.changesDropdown);
		select.selectByVisibleText("Media files");
	}

	@Then("^user verifies all files have extention$")
	public void user_verifies_all_files_have_extention() {
		recentChangesPage RCpage=new recentChangesPage();
		for(int a=0;RCpage.filesText.size()>a;a++) {
			Assert.assertTrue(RCpage.filesText.get(a).getText().contains("."));
		}
	}

}
