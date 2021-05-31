package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features", 
		glue = { "stepdefinitions" }, 
		tags = { "@End2End" },
		plugin = {"pretty",
				"html:target/cucumber-reports",
				"io.qameta.allure.cucumberjvm.AllureCucumberJvm"},
		monochrome = true
		)
public class TesteRunner {

}
