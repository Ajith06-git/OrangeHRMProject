package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/LoginDemo.feature", glue = {
		"stepdefinitions"}, monochrome = true, plugin = { "pretty", "html:target/Htmlreports"}

)

public class TestRunner {

}
