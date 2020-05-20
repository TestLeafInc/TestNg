package basics;

import org.testng.annotations.Test;

public class RunTests {

	// I want to create 3 tests -> Order ASCII

	@Test // It is testcase
	public void stop() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@Test
	public void walk() throws InterruptedException {
		Thread.sleep(5000);
	}

	@Test
	public void run() throws InterruptedException {
		Thread.sleep(3000);
	}

	

}
