package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.sapient.bddframework.cucumberframework.BasePage;
import com.sapient.bddframework.cucumberframework.DriverFactory;

import Utils.Utilities;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.NewToursLoginPage;

public class ValidatingHomePage {

	private NewToursLoginPage asp = NewToursLoginPage.getInstance();
	public WebDriver driver = BasePage.getDriver();

	@Then("^New Tours logo image is displayed in top left$")
	public void new_Tours_logo_image_is_displayed_in_top_left() throws Throwable {

		Assert.assertTrue(asp.Test_TC_LoginOage_01_verifyLogin(), "New Tours Page get login");
	}

	@Then("^I Close the browser$")
	public void i_Close_the_browser() throws Throwable {
		driver.close();
	}

}
