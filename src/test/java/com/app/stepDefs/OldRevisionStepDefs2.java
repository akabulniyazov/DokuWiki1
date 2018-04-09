package com.app.stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.app.pages.homePage;
import com.app.utilities.browser;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OldRevisionStepDefs2 {
	
	WebDriver driver=browser.getDriver();

	homePage h=new homePage();
	
	
	
	@Then("^User creates \"([^\"]*)\" file$")
	public void user_creates_file(String arg1) {
		h.CreateThisPage.click();

		h.textArea.sendKeys(arg1);

		h.saveButton.click();
	
	}

	@Then("^User edits \"([^\"]*)\" file to \"([^\"]*)\" file and saves it$")
	public void user_edits_file_to_file_and_saves_it(String arg1, String arg2) throws InterruptedException {
		h.EditThisPage.click();

		h.textArea.clear();

		h.textArea.sendKeys(arg2);

		h.saveButton.click();

		Thread.sleep(3000);


		
	   
	}

	@Then("^User validates the change by clicking start link$")
	public void user_validates_the_change_by_clicking_start_link() {
		h.start.click();

		Assert.assertEquals(h.hackCyb.getText(), "Hackers Cybertek");
		
		
	    
	}

	@Then("^User logs out$")
	public void user_logs_out() {
		
		h.logOut.click();
	   
	}

	@When("^User navigates to tool bar and clicks Old Revision tool$")
	public void user_navigates_to_tool_bar_and_clicks_Old_Revision_tool() throws InterruptedException {
		
		h.oldRevision.click();
		Thread.sleep(4000);
	   
	}

	@Then("^User verifies \"([^\"]*)\" text isDisplayed$")
	public void user_verifies_text_isDisplayed(String arg1) {
		Assert.assertTrue(h.oldrevisionText.isDisplayed());
		
		
		
	   
	}

	@Then("^User cliks on sunglass image which is on the second line with a text created$")
	public void user_cliks_on_sunglass_image_which_is_on_the_second_line_with_a_text_created() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(h.sunGlass));
		element.click();
		
	
	}

	@Then("^User verifies created \"([^\"]*)\" changed to \"([^\"]*)\" with valid dates$")
	public void user_verifies_created_changed_to_with_valid_dates(String arg1, String arg2) {
		System.out.println(h.changedText.getText());
		Assert.assertEquals(arg2, h.changedText.getText());
	    
	}

	@Then("^User deletes the file$")
	public void user_deletes_the_file() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(h.showPage));
		Thread.sleep(2000);
		element.click();	
		Thread.sleep(2000);
		h.actionEdit.click();
		Thread.sleep(2000);
		h.textArea.clear();
		Thread.sleep(2000);
		h.saveButton.click();
		
	
	}

	
}
