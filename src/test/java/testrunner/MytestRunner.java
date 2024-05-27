package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        publish = true ,
				features = {"src\\test\\resource\\AppFeatures"},
				glue = {"stepdefinitions", "AppHooks"},
				plugin = {"pretty","html:target/cucumber-reports"},
		        monochrome = true
				)

public class MytestRunner {

}
