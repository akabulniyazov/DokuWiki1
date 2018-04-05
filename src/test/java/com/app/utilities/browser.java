package com.app.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
	static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
			String Browser = configuration.getPropertyValue("browser");
			switch (Browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
			case "Internet Explorer":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
			}
		}
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}