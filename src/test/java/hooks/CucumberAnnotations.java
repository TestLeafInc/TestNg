package hooks;

import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class CucumberAnnotations {
		
	@Before
	public void beforeEveryScenario(Scenario sc) {
		System.out.println(sc.getName());		
		System.out.println("I am going to run second");
		if(sc.getName().contains("Just Check")) {
			System.out.println("Let me do something more");
		}
		
	}
	
	@Before(order=9999)
	public void beforeEveryScenario1() {
		System.out.println("I am going to be first");
	}
	
	
	@After
	public void afterEveryScenario(/*Step step*/) {
		/*System.out.println(step.getKeyword());
		System.out.println(step.getLine());*/
		System.out.println("I am going to run this after every scenario");
	}
	
	
	
	@BeforeStep
	public void beforeEachStep() {
		System.out.println("This is to inform you that I am going to run the step");
	}
	

	@AfterStep
	public void afterEachStep() {
		System.out.println("This is to inform you that I ran the step - Took Snapshot");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
