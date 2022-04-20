package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.sapient.bddframework.cucumberframework.BasePage;
import com.sapient.bddframework.cucumberframework.DriverFactory;

import Utils.Utilities;
import cucumber.api.java.en.Given;

public class NewToursLoginPage extends BasePage implements NewToursPageInterface {

	public static NewToursLoginPage asp=null;
	public static NewToursLoginPage getInstance() {
		if(NewToursLoginPage.asp== null)
			asp = new NewToursLoginPage();
		return asp;
	}
	
	@Given("^New Tours Web Page is opened$")
	public void new_Tours_Web_Page_is_opened() throws Throwable {
		driver = DriverFactory.getNewDriverInstance();
		BasePage.setDriver(driver);
		driver.get(Utilities.getConfigValue("url"));
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    
	}
	
	
	
	
	public boolean Test_TC_LoginOage_01_verifyLogin() throws  IOException {
				
		try {
			System.out.println("verifyLogo");
			if(driver.findElement(Logo_NewTours).isDisplayed())
			System.out.println("New Tours Logo shoulfd be displayed");
			return true;
		}
		catch (Exception e) {
			return false;
		}
		
	}
	
	public void LoginTest () 
	{
		
			System.out.println("Validating Login Functinality ");
			driver.findElement(Home_Username).sendKeys("mercury");
			driver.findElement(Home_Password).sendKeys("mercury");
			driver.findElement(Home_Submit).click();
			
		
	}
	
	public String WelcomeMsg()
	{
		return driver.findElement(Home_Welcome_Message).getText();

	}
			
			
		
		
	}

