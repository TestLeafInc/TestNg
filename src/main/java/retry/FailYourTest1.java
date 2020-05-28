package retry;

import org.testng.annotations.Test;

public class FailYourTest1 {
	
	@Test(timeOut=3500)
	public void failTheTest() throws InterruptedException {
		
		// sleep can be between 2000 to 5000 ms
		int randomSleep = 2000 + ((int)(Math.random() * (3000)));
		System.out.println(randomSleep);
		Thread.sleep(randomSleep);

	}

}
