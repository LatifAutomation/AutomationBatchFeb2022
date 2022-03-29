package TestNGPackage;

import org.testng.annotations.Test;

public class ParentClass 
{

	
	@Test(dependsOnMethods="TC2")
	public void TC1()
	{
		System.out.println("I am in Test case 1");
	}
	
	
	
	@Test
	public void TC2()
	{
		System.out.println("I am in Test case 2");
	}
	
	
	
}