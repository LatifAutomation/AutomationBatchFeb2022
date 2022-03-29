package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ExecutionOrder 
{
  @Test
  public void firstTestcase() 
  {
	System.out.println(" I am in first Test case");  
  }
  
  
  @Test
  public void secondTestcase() 
  {
	System.out.println(" I am in secondTestcase");  
  }
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Login completed");
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Logout done");
  }

  @BeforeClass
  public void beforeClass() 
  {
	 System.out.println(" I am in Before class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println(" I am in After Class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println(" I am in Before Test");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println(" I am in After Test");
  }

 @BeforeSuite
  public void beforeSuite() 
 {
	 System.out.println(" I am in before Suite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println(" I am in After Suite");
  }

}
