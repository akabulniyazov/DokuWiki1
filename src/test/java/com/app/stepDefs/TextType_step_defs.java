package com.app.stepDefs;



import static org.testng.Assert.assertTrue;

import com.app.pages.homePage;

import cucumber.api.java.en.Then;

public class TextType_step_defs {
	homePage hm = new homePage();
	@Then("^User writes \"([^\"]*)\" bold text format inside Cybertek school link$")
	public void user_writes_bold_text_format_inside_Cybertek_school_link(String text) {
	  hm.CreateThisPage.click();
	  hm.bold.click();
	  hm.textArea.sendKeys(text);
	  hm.saveButton.click();
	  
	}

	@Then("^User verify if link is bold$")
	public void user_verify_if_link_is_bold() {
		String fontWeight = hm.boldLink.getCssValue("font-weight");
		  boolean isBold  = "bold".equals(fontWeight) || "bolder".equals(fontWeight) || Integer.parseInt(fontWeight) >= 700;
		  assertTrue(isBold);
	}

	@Then("^User writes \"([^\"]*)\" italic text format inside Cybertek school link$")
	public void user_writes_italic_text_format_inside_Cybertek_school_link(String text) {
		hm.CreateThisPage.click();
		hm.italic.click();
		hm.textArea.sendKeys(text);
		hm.saveButton.click();

	}
	
	@Then("^User verify if link is italic$")
	public void user_verify_if_link_is_italic() {
		
		  assertTrue(hm.italicLink.isDisplayed());
	}
	
	@Then("^delete bold link$")
	public void delete_bold_link() {
	    hm.EditThisPage.click();
	    hm.textArea.clear();
	    hm.saveButton.click();
	}

	@Then("^delete italic link$")
	public void delete_italic_link() {
	   hm.EditThisPage.click();
	   hm.textArea.clear();
	   hm.saveButton.click();
	}

}
