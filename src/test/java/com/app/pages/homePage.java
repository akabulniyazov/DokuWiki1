package com.app.pages;

import java.util.List;

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

}
