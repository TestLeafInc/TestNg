package listeners;

import org.testng.IExecutionListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IAfterMethod;

public class NotifyStartAndEnd implements IExecutionListener, IAfterMethod{

	public void onExecutionStart() {
		System.out.println("The test is about to start !!");
		// Email API call -> Send email to you
	}

	public void onExecutionFinish() {
		System.out.println("The test suite is complete");
		// Email API call -> Send email to you
		// Publish the report to your server !! 
	}

	public String[] getGroupFilters() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public String[] getGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getDependsOnGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getDependsOnMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getAlwaysRun() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean getInheritGroups() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getTimeOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setTimeOut(long l) {
		// TODO Auto-generated method stub
		
	}

	public void setGroups(String[] groups) {
		// TODO Auto-generated method stub
		
	}

	public void setDependsOnGroups(String[] groups) {
		// TODO Auto-generated method stub
		
	}

	public void setDependsOnMethods(String[] dependsOnMethods) {
		// TODO Auto-generated method stub
		
	}

	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	public void setEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		
	}

}
