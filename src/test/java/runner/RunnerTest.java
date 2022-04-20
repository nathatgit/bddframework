package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cucumber-reports", "json:target/cucumber.json",
		"junit:junit_xml/cucumber.xml", },

		features = { "src/test/resources/features" }, glue = { "stepDefinitions" }, monochrome = true, // display the
																										// console
																										// output in
																										// readable
																										// format
		dryRun = false, // to check the mapping b/w feature and stepdef
		strict = true // validate if any undefine step def is present or not

		//tags = "@tag1"

)

public class RunnerTest {

}

// OR :tags={"@TC02, @TC01"} -- execute all test cases which are tagged as TC01 or TC02
//AND : tags{"@TC02", "@TC01"}  execute all test cases which are tagged as TC01 and TC02 (both )

//Ignore tags={"~@TC02"}