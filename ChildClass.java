package TestNGPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChildClass extends ParentClass

{
  
	
	
	
	@AfterSuite
	
	public void aftsuite()
	{
		System.out.println(" I am in After suite");
	}
	@Test(dependsOnMethods="TC1")
	public void TC3()
	{
		System.out.println(" I am in Test case 3");
	}
	
	
	@Test
	public void TC4()
	{
		System.out.println(" I am in Test case 4");
	}
	
	
	@BeforeTest
	public void beftest()
	{
		System.out.println(" I am in before Test");
	 }
	
}
