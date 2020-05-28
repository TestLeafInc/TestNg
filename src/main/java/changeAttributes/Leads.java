package changeAttributes;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Leads {
	
	@Test(invocationCount=2)
	public void createLead() {
		System.out.println("Create lead running");
	}
	
	@Test(dependsOnMethods="createLead")
	public void editLead() {
		
	}
	
	@Test(enabled=false)
	public void deleteLead() {
		
	}
	
	@Test(dataProvider="data")
	public void mergeLeads(String num1, String num2) {
		System.out.println(num1);
		System.out.println(num2);
	}

	
	@DataProvider(name="data")
	public String[][] getRegisterData(Method m){
		System.out.println(m.getName());
		String[][] data = new String[2][2];
		data[0][0] = "1101";
		data[0][1] = "1102";		
		
		data[1][0] = "1103";
		data[1][1] = "1104";	
		
		return data;
	}
	
	@DataProvider(name="dataOnFailure")
	public String[][] getRegisterDataOnFailure(Method m){
		System.out.println(m.getName());
		String[][] data = new String[2][2];
		data[0][0] = "2101";
		data[0][1] = "2102";		
		
		data[1][0] = "2103";
		data[1][1] = "2104";	
		
		return data;
	}
}
