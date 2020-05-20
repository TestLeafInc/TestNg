package basics;

import org.testng.annotations.Test;

public class Book {

	// I want to create 2 tests -> Order ASCII

	@Test(invocationCount=2)
	public void getBook() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	@Test(timeOut=2000)
	public void sellBook() throws InterruptedException {
		Thread.sleep(5000);
	}

	
	@Test(dependsOnMethods="sellBook",alwaysRun=true)
	public void deleteBook() throws InterruptedException {
		Thread.sleep(5000);
	}
	

	

}
