package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.browser;

public class UpdatePage {
	
	WebDriver driver;
	//============
	public UpdatePage() {
		this.driver=browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='newpass']")
	public WebElement newPass;
	
	@FindBy(xpath="//input[@name='passchk']")
	public WebElement onceAgain;
	
	@FindBy(xpath="//input[@name='oldpass']")
	public WebElement oldPass;
	
	@FindBy(xpath="//button[.='Save']")
	public WebElement save;
	

}
