package com.app.pages;

import java.util.List;

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
	
	@FindBy(linkText="Admin")
	public WebElement adminButton;
	
	@FindBy(linkText="Sitemap")
	public WebElement sitemap;
	
	@FindBy(xpath="//li[@class='level1']//a")
	public List<WebElement> listOfLinks;
	
	@FindBy(xpath="//a[@title='Old revisions [O]']")
	public WebElement oldRevision;
	
	@FindBy(xpath="(//span[@class='user'])[1]/bdi")
	public WebElement verifyUserInOldRevision;
	
	@FindBy(xpath="//button[@accesskey='b']")
	public WebElement bold;
	
	@FindBy(tagName="strong")
	public WebElement boldLink;
	
	@FindBy(xpath="//button[@accesskey='i']")
	public WebElement italic;
	
	@FindBy(tagName="em")
	public WebElement italicLink;
	
	
	
	public void clickOnLink(String link, List<WebElement> listOfLinks) {
		for(WebElement wb : listOfLinks) {
			if(link.contains(wb.getText())) {
				wb.click();
				return;
			}
		}
	}

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

	

	@FindBy(xpath="//div[@class='page group']")
	public WebElement bodyText;
}
