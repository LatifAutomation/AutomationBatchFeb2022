package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML3/name3.html");
		
		driver.manage().window().maximize();
		
		
		//First name
		
		driver.findElement(By.tagName("input")).sendKeys("Mahesh");
		
		// Middle Name
		
		driver.findElement(By.id("abc")).sendKeys("Tushar");
		
		//Last Name
		
		driver.findElement(By.name("lname")).sendKeys("Gupta");

	}

}
