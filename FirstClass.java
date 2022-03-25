package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClass 

{
 
	@Test()
	
	public void first()
	{
		System.out.println(" I am in First Test case");
	}
	
	
	@Test(priority=1)
	
	public void second()
	{
	
		System.out.println(" I am in second test case");
	}
	
	
	@Test
	public void third()
	{
		System.out.println(" I am in third Test case");
	}
	
	@Test(priority=-1)
	public void four()
	{
		
		System.out.println(" I am in four Test case");
	}
	

	@Test(priority=-4)
	public void five()
	{
		System.out.println(" I am in five Test case");
	}
	
}
