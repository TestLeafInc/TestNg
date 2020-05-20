package inherit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	@BeforeMethod
	public void startApp() {
		System.out.println("I am the parent");

	}

	@AfterMethod
	public void logout() {
		System.out.println("I am the parent");
	}

}
