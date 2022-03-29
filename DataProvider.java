package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider 
{
  
	WebDriver driver;
	@Test
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test(dataProvider="logindata")
	public void loginFacebook(String username,String password)
	{
		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	
	
	@org.testng.annotations.DataProvider(name="logindata")
	
	public Object[][] userlogin()
	{
		Object[][]data=new Object[2][2];
		
		data[0][0]="test@gmail.com";
		
		data[0][1]="test1234";
		
        data[1][0]="test2@gmail.com";
		
		data[1][1]="test@123445";
		
		return data;
	}
	
	
	
}
