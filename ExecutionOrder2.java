package TestNGPackage;

import org.testng.annotations.Test;

public class ExecutionOrder2 extends ExecutionOrder
{
  @Test
  public void abc() 
  {
	  System.out.println("Abc");
  }
  
  @Test
  public void pqr() 
  {
	  System.out.println("pqr");
  }
}
