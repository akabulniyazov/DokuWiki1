package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.browser;

public class MediaManagerPage {
	private WebDriver driver;

	public MediaManagerPage() {
		driver = browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"mediamanager__btn_delete\"]/div/button")
	public WebElement deletMedia;
	
	@FindBy(linkText="Media Files")
	public WebElement mediaFilesTab;

	@FindBy(linkText = "Upload")
	public WebElement uploadTab;

	@FindBy(xpath = "//*[@id=\"mediamanager__uploader\"]/div/div[2]/input")
	public WebElement uploader;

	@FindBy(xpath = "//button[@class='qq-upload-action']")
	public WebElement uploadFile;

}
