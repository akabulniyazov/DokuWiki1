package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.browser;

public class loginPage {
	
	WebDriver driver;
	//altyn zver
	public loginPage() {
		this.driver=browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='action login']")
	public WebElement loginButton;
	
	@FindBy(id="focus__this")
	public WebElement Username;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement Password;
	
	@FindBy(xpath="//div[@class='centeralign']//button[@type='submit']")
	public WebElement logIn;
	
	public void login(String username, String password) {
		Username.sendKeys(username);
		Password.sendKeys(password);
		logIn.click();
	}
	
}
