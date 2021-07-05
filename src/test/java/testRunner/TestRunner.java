package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/Test.feature"},
glue= {"stepDefinations","Hooks"},
//tags="@Smoke",
stepNotifications = true,
plugin = {"pretty",
		"junit:target/MyReports/report.xml",
		"json:target/MyReports/report.json"},
monochrome = true,
publish = false)
//dryRun = true)
public class TestRunner {

}
