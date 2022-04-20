package com.sapient.bddframework.cucumberframework;

import org.openqa.selenium.WebDriver;

public class BasePage {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return BasePage.driver;
	}

	public static void setDriver(WebDriver driver) {
		BasePage.driver = driver;
	}
}
