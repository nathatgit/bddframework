package stepDefinitions;

import cucumber.api.java.en.Given;

public class bddTest {

	
	
	
	 @Given("^i am on scenario A$") 
	 public void i_am_on_scenario_A() throws
	  Throwable { System.out.println("I am on scenario A"); }
	  
	  @Given("^i am on scenario B$") 
	  public void i_am_on_scenario_B() throws
	  Throwable { System.out.println("I am on scenario B"); }
	  
	  @Given("^i am on scenario C$") 
	  public void i_am_on_scenario_C() throws
	  Throwable { System.out.println("I am on scenario C"); }
	  
	  @Given("^i am on scenario D$")
	  public void i_am_on_scenario_D() throws
	  Throwable { System.out.println("I am on scenario D"); }
	  
	  @Given("^i am on scenario E$") 
	  public void i_am_on_scenario_E() throws
	  Throwable { System.out.println("I am on scenario E"); }
	 

	
	
	
	@Given("^i am on scenario \"([^\"]*)\"$")
	public void i_am_on_scenario(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println(arg1);
	}
	
} 