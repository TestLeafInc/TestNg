package alternate;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test(groups="sanity")
  public void login() {
  }
  @BeforeMethod(groups="smoke")
  public void beforeMethod() {
  }
  
  @BeforeMethod(groups="sanity")
  public void beforeMethod1() {
  }

  @AfterMethod(groups="sanity")
  public void afterMethod() {
  }

  @BeforeClass(groups="sanity")
  public void beforeClass() {
  }

  @AfterClass(groups="sanity")
  public void afterClass() {
  }

  @BeforeTest(groups="sanity")
  public void beforeTest() {
  }

  @AfterTest(groups="sanity")
  public void afterTest() {
  }

  @BeforeSuite(groups="sanity")
  public void beforeSuite() {
  }

  @AfterSuite(groups="sanity")
  public void afterSuite() {
  }

  @BeforeGroups(groups="sanity")
  public void beforeGroup() {
	  System.out.println("Before the group");
  }
  
  @AfterGroups(groups="sanity")
  public void afterGroup() {
	  
  }
  
  
  
}
