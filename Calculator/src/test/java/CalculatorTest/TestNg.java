package CalculatorTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg extends Calculator_Automation{
  @Test
  public void testcase1()
  {
	  System.out.println("TestCase1");
  }
  @Test
  public void testcase2()
  {
	  System.out.println("TestCase2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will execute Before every method");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute After every method");

  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This will execute before every class");
}
  @AfterClass
  public void afterClass() {
	  System.out.println("This will execute After every class");
  
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This will execute before every suite");  
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("This will execute before every class");
  }
}
// Code is written here just to check workability of testNg please check with your local system.