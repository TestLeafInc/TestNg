package assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.ReadExcel;

public class Register extends BaseTest {
	
	// [row][column]
	@DataProvider(name="register")
	public String[][] getRegisterData() throws IOException{
		String[][] data = ReadExcel.readDataFromExcel();		
		return data;
	}
	
	@Test(groups="sanity", dataProvider="register")
	public void register(String email, String pwd) {
		
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
