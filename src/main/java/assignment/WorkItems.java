package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkItems extends BaseTest {
	
	@DataProvider(name="workItems")
	public String[][] getRegisterData(){
		String[][] data = new String[2][2];
		data[0][0] = "babu.m3@testleaf.com";
		data[0][1] = "leaf@12";		
		
		data[1][0] = "babu.m4@testleaf.com";
		data[1][1] = "leaf@12";	
		
		return data;
	}
	
	@Test(groups="sanity", dataProvider="register")
	public void workItems(String email, String pwd) {
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("emailNew")).sendKeys(email);
		driver.findElement(By.id("passwordNew")).sendKeys(pwd);
		driver.findElement(By.id("confirmNew")).sendKeys(pwd);
		driver.findElement(By.id("checkTerms")).click();
		driver.findElement(By.id("buttonRegister")).click();		
		String name = driver.findElement(By.tagName("strong")).getText();
		if(name.contains(email)) {
			System.out.println("Login successful");
		}
	}

}
