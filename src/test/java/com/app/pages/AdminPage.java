package com.app.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.browser;

public class AdminPage {
private WebDriver driver;
	
	public AdminPage() {
		this.driver=browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[.='User Manager']")
	public WebElement userManager;
	
	@FindBy(id="add_userid")
	public WebElement user;
	
	@FindBy(id="add_userpass")
	public WebElement password;
	
	@FindBy(id="add_userpass2")
	public WebElement onceAgain;
	
	@FindBy(id="add_username")
	public WebElement realName;
	
	@FindBy(id="add_usermail")
	public WebElement email;
	
	@FindBy(id="add_usergroups")
	public WebElement groups;
	
	@FindBy(xpath="//button[.='Add']")
	public WebElement addButton;
	
	@FindBy(xpath="//tr[@class='user_info']//td[2]")
	public List<WebElement> listVerification;
	
	public boolean verifyUserIsPresent(String name) {
		
		for(WebElement wb : listVerification) {
			System.out.println(wb.getText());
			System.out.println("this is name"+name);
			if(wb.getText().equals(name)) {
				return true;
			}
			
		}
		return false;
	}
	
	
	
	
	

}
