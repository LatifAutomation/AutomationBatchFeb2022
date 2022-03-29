package TestNGPackage;

import org.testng.annotations.Test;

public class MultipleDependency 
{
  
	@Test(dependsOnMethods="product_search")
	public void payment()
		{
			System.out.println(" I am in payment Test case");
		}
	 
	 
	@Test
	public void register()
	{
		System.out.println(" I am in Registartion Test case");
	}
	
	 @Test(dependsOnMethods= {"product_search","payment"})
		
		public void report()
		{
			System.out.println(" I am in report Test case");
		}
	   
	   
	
	@Test(dependsOnMethods="register")
	public void login()
	{
		System.out.println(" I am in login Test case");
	}
	
	
   @Test(dependsOnMethods="report")
	
  	public void logout()
  	{
  		System.out.println(" I am in logout Test case");
  	}
   
   
   @Test(dependsOnMethods= {"register","login"})
   public void product_search()
	{
		System.out.println(" I am in Product search Test case");
	}
   
   
	
}
