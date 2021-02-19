package testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/java/features",glue={"StepDefinitions"}, plugin = { "pretty" , "html:target/Destination"},
monochrome = true)

public class Runner {

	
}
