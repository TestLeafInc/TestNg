package listeners;

import org.testng.IExecutionListener;
import org.testng.ITestResult;

public class NotifyStartAndEnd implements IExecutionListener{


	public void onExecutionStart() {
		System.out.println("The test is about to start !!");
	}

	public void onExecutionFinish() {
		System.out.println("The test suite is complete");
	}

}
