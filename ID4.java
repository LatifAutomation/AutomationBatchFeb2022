package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID4 {

	public static void main(String[] args)
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Email Address or phone No
		
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		
		//password
		
		
		driver.findElement(By.id("pass")).sendKeys("Test@12324");
		
		
	}

}
