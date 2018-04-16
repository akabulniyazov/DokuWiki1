package com.app.stepDefs;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.pages.MediaManagerPage;
import com.app.pages.homePage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.browser;

import cucumber.api.java.en.Then;

public class MediaStepDefs {
	private WebDriver driver;

	public MediaStepDefs() {
		driver = browser.getDriver();
		PageFactory.initElements(driver, this);

	}

	homePage hPage = new homePage();
	MediaManagerPage mediaPAge = new MediaManagerPage();
	String fileName = "Iskender copy.txt";
	String filePath = "/Users/iskanderuraiymov/Desktop/untitled folder/Iskender copy.txt";

	@Then("^user uploads text file$")
	public void user_uploads_text_file() throws InterruptedException {
		Thread.sleep(2000);
		hPage.mediaMenagerLink.click();

		try {

			System.out.println("media file alredy exist and will be delited to check functionality");
			driver.findElement(By.linkText(fileName)).click();
			mediaPAge.deletMedia.click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {

		}
		BrowserUtils.waitForPageToLoad(3);
		mediaPAge.uploadTab.click();
		mediaPAge.uploader.sendKeys(filePath);
		mediaPAge.uploadFile.click();
		Thread.sleep(2000);

	}

	@Then("^user must be able to see that text file in media files$")
	public void user_must_be_able_to_see_that_text_file_in_media_files() throws InterruptedException {

		mediaPAge.mediaFilesTab.click();
		assertEquals(driver.findElement(By.linkText("test1.rtf")).getText(), fileName);
		Thread.sleep(2000);
	}

	@Then("^user should be able to delete that file$")
	public void user_should_be_able_to_delete_that_file() throws InterruptedException {
		
		BrowserUtils.waitForPageToLoad(3);
		 hPage.mediaMenagerLink.click();
		//mediaPAge.mediaFilesTab.click();
		List<WebElement> list = driver.findElements(By.linkText(fileName));
		list.get(0).click();

		Thread.sleep(2000);
		mediaPAge.deletMedia.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("^that file must be deleted from media files$")
	public void that_file_must_be_deleted_from_media_files() throws InterruptedException {
		hPage.mediaMenagerLink.click();
		//mediaPAge.mediaFilesTab.click();
		List<WebElement> list = driver.findElements(By.linkText(fileName));
		Thread.sleep(3000);
		assertEquals(list.size(), 0);
	}

}
