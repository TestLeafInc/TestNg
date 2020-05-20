package inherit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Child extends Base {
	
	@BeforeMethod
	public void startApp() {
		System.out.println("I am the child");
	}

	@Test
	public void createLead() {
		
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("I am the child");
	}

}
