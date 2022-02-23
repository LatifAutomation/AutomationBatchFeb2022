package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Email address
		
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		
		//Password
		
		driver.findElement(By.name("pass")).sendKeys("Test@123456");
		
		
		//Login
		
		driver.findElement(By.name("login")).click();

	}

}
