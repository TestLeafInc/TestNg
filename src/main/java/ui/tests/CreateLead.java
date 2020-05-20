package ui.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateLead {

	@DataProvider(name="Create Lead"/*, indices= {1,2}*/, parallel=true)
	public String[][] getTestData() {
		
		String[][] data = new String[3][3];
		
		data[0][0] = "TestLeaf"; // company name
		data[0][1] = "Babu"; //first name
		data[0][2] = "M"; // last name
		
		data[1][0] = "Google"; // company name
		data[1][1] = "Aby"; //first name
		data[1][2] = "J"; // last name
		
		data[2][0] = "FB"; // company name
		data[2][1] = "Mark"; //first name
		data[2][2] = "Z"; // last name
		
		return data;
	}
	
	
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String www, String uName, String pwd) {
		
		System.out.println("Open chrome and Load the URL "+www);
		System.out.println("enter the username: "+uName);
		System.out.println("enter the password: "+pwd);
		System.out.println("click login");
	}
	
	//@Parameters({""}) -> You cannot have both Parameters and DP on the same @Test
	@Test(dataProvider="Create Lead")
	public void createLead(String cName, String fName, String lName) throws InterruptedException {
		
		System.out.println("click CRM/SFA link");
		System.out.println("click Create Lead link");
		System.out.println("type company name: "+cName);
		System.out.println("type first name: "+fName);
		System.out.println("type last name: "+lName);
		System.out.println("click create lead");
		
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("Logout and close");
	}
	
}
