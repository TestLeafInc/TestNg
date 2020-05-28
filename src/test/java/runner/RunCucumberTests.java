package runner;

import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/features/CreateLead.feature"},
		glue= {"steps", "hooks"},
		tags= "@smoke and not @Gopi")


public class RunCucumberTests extends AbstractTestNGCucumberTests {

	
	@BeforeMethod
	public void runThis() {
		
	}
}
