package com.app.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.browser;

public class recentChangesPage {
	
	WebDriver driver;
	
	public recentChangesPage() {
		this.driver=browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@class='quickselect']")
	public WebElement changesDropdown;
	
	@FindBy(xpath="//img[@title='Show differences to current revisions']")
	public WebElement glassesPic;
	
	@FindBy(xpath="//a[@class='wikilink2']")
	public List<WebElement> filesText;

}
