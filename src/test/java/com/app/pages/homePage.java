package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.browser;

public class homePage {
	
	WebDriver driver;
	//============
	public homePage() {
		this.driver=browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Media Manager")
	public WebElement mediaMenagerLink;
	
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

	@FindBy(xpath="//a[.='start']")
	public WebElement start;
	
	@FindBy(xpath="//a[.='Hackers Cybertek']")
	public WebElement hackCyb;
	
	@FindBy(xpath="//a[@class='action revs']")
	public WebElement oldRevision;
	
	@FindBy(xpath="(//ul/li/div[@class='li']/a[@class='diff_link'])[1]")
	public WebElement sunGlass;
	
	@FindBy(id="old_revisions")
	public WebElement oldrevisionText;
	
	@FindBy(xpath="//table[@class='diff diff_sidebyside']//td[@class='diff-addedline']")
	public WebElement changedText;
	
	@FindBy(xpath="//a[@class='action edit']")
	public WebElement actionEdit;
	
	@FindBy(xpath="//a[@class='action show']")
	public WebElement showPage;

	@FindBy(xpath="//a[@title='Recent Changes [R]']")
	public WebElement recentChanges;

	@FindBy(xpath="//a[@class='action profile']")
	public WebElement updateProfile;

	@FindBy(xpath="//div[@class='page group']")
	public WebElement bodyText;
	
	@FindBy(xpath="//input[@name='newpass']")
	public WebElement newPass;
	
	@FindBy(xpath="//input[@name='passchk']")
	public WebElement onceAgain;
	
	@FindBy(xpath="//input[@name='oldpass']")
	public WebElement oldPass;
	
	@FindBy(xpath="//button[.='Save']")
	public WebElement saveUpdate;
	
	@FindBy(xpath="//a[@title='Log In']")
	public WebElement logIn;
	
	
}
