package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.sapient.bddframework.cucumberframework.BasePage;
import com.sapient.bddframework.cucumberframework.SingletonDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private WebDriver driver;

	@Before(order = 0)
	public void setup() throws IOException {

		driver = SingletonDriver.getDriverinsttace();
		BasePage.setDriver(driver);

		System.out.println("Start of Scenario");

	}

	/*
	 * @Before (order=1) public void setup1() throws IOException {
	 * 
	 * driver = SingletonDriver.getDriverinsttace(); BasePage.setDriver(driver);
	 * 
	 * System.out.println("Inside of Before");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @Before ("@SB, @SD") public void setup2() throws IOException {
	 * 
	 * driver = SingletonDriver.getDriverinsttace(); BasePage.setDriver(driver);
	 * 
	 * System.out.println("Tagged Hook");
	 * 
	 * }
	 */

	@After(order = 0)
	public void tearDown() {
		/*
		 * driver.quit();
		 * 
		 * SingletonDriver.deInstantiatiDriver();
		 */

		System.out.println("END of Scenario\n");

	}
	/*
	 * @After(order = 1) public void tearDown1() {
	 * 
	 * driver.quit();
	 * 
	 * SingletonDriver.deInstantiatiDriver();
	 * 
	 * 
	 * System.out.println("Inside of END");
	 * 
	 * }
	 */
}
