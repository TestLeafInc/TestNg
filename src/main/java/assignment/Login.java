package assignment;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login extends BaseTest {
	
	@DataProvider(name="login")
	public String[][] getRegisterData(Method m){
		System.out.println(m.getName());
		String[][] data = new String[2][2];
		data[0][0] = "babu.m1@testleaf.com";
		data[0][1] = "leaf@12";		
		
		data[1][0] = "babu.m2@testleaf.com";
		data[1][1] = "leaf@12";	
		
		return data;
	}
	
	@Test(groups="smoke",dataProvider="login")
	public void login(String username, String password) {		
		
		boolean displayed = driver.findElement(By.id("email")).isDisplayed();
		assertTrue(displayed);
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("buttonLogin")).click();
		
		/*boolean displayed1 = driver.findElement(By.id("email")).isDisplayed();
		assertFalse(displayed1);*/
		
		String name = driver.findElement(By.tagName("strong")).getText();
		Assert.assertEquals(name, username);
		
		SoftAssert soft =  new SoftAssert();
		
		
		String title = driver.getTitle();
		soft.assertEquals(title, "ACME Login");
		
		System.out.println("It continues");
		
		
	}
	
	
}
