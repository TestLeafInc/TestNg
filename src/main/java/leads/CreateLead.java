package leads;

import org.testng.annotations.Test;

public class CreateLead {
	
	@Test(groups= {"leads","Sudharsan"}, timeOut=2000)
	public void createLead() throws InterruptedException {
		System.out.println("Running create leads");
		Thread.sleep(4000);
	}

}
