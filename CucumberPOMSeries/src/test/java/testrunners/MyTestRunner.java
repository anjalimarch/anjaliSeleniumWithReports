package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.testng.annotations.DataProvider;


@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/test/resources/AppFeatures"},
				features = {"src/test/resources/AppFeatures/LoginPage.feature"},
		glue = {"stepdefinitions", "AppHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"

				
		}
		
		)

public class MyTestRunner {

	
	
	
	
	
	
}

