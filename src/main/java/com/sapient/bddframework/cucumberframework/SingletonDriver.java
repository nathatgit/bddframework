package com.sapient.bddframework.cucumberframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {
	
	private static WebDriver driver;
	
	public static void initDriver(String browser) {
		if(null==driver) {
			switch (browser.toUpperCase()) {
			
			case "CHROME":
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
			case "IE":
				break;
				
				default:		
			
			
			}
		}
	}
	
	public static WebDriver getDriverinsttace() {
		
		if(null==driver) {
			initDriver("chrome");  //Default value of chrome
			
		}
		return driver;
		
	}
	
	public static void deInstantiatiDriver() {
		driver=null;
	}

}
