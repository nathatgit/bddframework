package com.sapient.bddframework.cucumberframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static WebDriver getNewDriverInstance() {
		
		WebDriver driver = null;
				
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		BasePage.getDriver();
		
		return driver;
	}
}
