package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	
	/*Given Launch Browser <Chrome>
	And Login to application <username>
	And Click CRM*/

	@Given("^Launch Browser (.*)$")
	public void launchApp(String browserName) {
		System.out.println("Launched browser :"+browserName);
	}
	
	@Given("Login to application (.*)$")
	public void loginApp(List<String> credentials) {
		System.out.println("type username as  :"+credentials.get(0));
		System.out.println("type password as  :"+credentials.get(1));
	}
	
	@Given("Login using username as(.*)$")
	public void loginApp(String username) {
		System.out.println("type username as  :"+username);
	}
	
	@Given("Click CRM")
	public void clickCrm() {
		System.out.println("Clicked CRM/SFA");
	}
	
	@When("Click Create Lead")
	public void click_Create_Lead() {
		System.out.println("Clicked Create Lead");
	}
	
	@When("Type Company Name (.*)$")
	public void type_Company_Name(String companyName) {
		System.out.println("Typed company name as : "+companyName);
	}
	
	@When("Type First Name (.*)$")
	public void type_First_Name(String firstName) {
		System.out.println("Typed first name as : "+firstName);
	}
	
	@When("Type Last Name (.*)$")
	public void type_Last_Name(String lastName) {
		System.out.println("Typed last name as : "+lastName);
	}
	
	@Then("Confirm the Lead is created")
	public void confirmCreateLeadSuccess() {
		System.out.println("Confirmed Create Lead is success");
	}
	
	@Then("Click Logout")
	public void click_Logout() {
		System.out.println("Clicked Logout");
	}
	
	@Then("Close Browser")
	public void close_Browser() {
		System.out.println("Browser Closed");
	}

	@When("Choose Source (.*)$")
	public void chooseSource(String source) {
		System.out.println("The Source is selected as: "+source);
	}

}
