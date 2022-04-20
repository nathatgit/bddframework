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

public class ValidatingLoginFunctionality {

	private NewToursLoginPage asp = NewToursLoginPage.getInstance();
	public WebDriver driver = BasePage.getDriver();

	@Given("^New Tours Web Page is opened$")
	public void new_Tours_Web_Page_is_opened() throws Throwable {
		// driver = DriverFactory.getNewDriverInstance();
		// BasePage.setDriver(driver);
		driver.get(Utilities.getConfigValue("url"));
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	}

	@Then("^User enter username, password and click on submit$")
	public void user_enter_username_password_and_click_on_submit() throws Throwable {

		asp.LoginTest();

	}

	@Then("^User validate the welcome message$")
	public void user_validate_the_welcome_message() throws Throwable {

		Assert.assertEquals(asp.WelcomeMsg(), "SIGN-OFF");

	}

}
