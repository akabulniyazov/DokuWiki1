package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.browser;

public class homePage {
	
	WebDriver driver;
	
	public homePage() {
		this.driver=browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Create this page [E]']")
	public WebElement CreateThisPage;
	
	@FindBy(xpath="//textarea[@id='wiki__text']")
	public WebElement textArea;
	
	@FindBy(id="edbtn__save")
	public WebElement saveButton;
	
	@FindBy(xpath="//div[@class='page group']")
	public WebElement textBody;
	
	@FindBy(xpath="//a[@title='Edit this page [E]']")
	public WebElement EditThisPage;
	
	@FindBy(xpath="//a[@title='Log Out']")
	public WebElement logOut;
	
	@FindBy (xpath="//a[@class='action index']")
	public WebElement sideMap;

	@FindBy (xpath="//a[@class='idx_dir']")
	public WebElement wiki;
	
	@FindBy (xpath="///div[@class='li'] /a[@title='wiki:syntax']")
	public WebElement syntax;
	
	@FindBy (xpath="formatting_syntax")
	public WebElement syntaxPDisplay;
}
