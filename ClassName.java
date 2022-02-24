package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/HTML3/ClassName3.html");
		driver.manage().window().maximize();
		
		
		//First Name
		
		driver.findElement(By.tagName("input")).sendKeys("Madhuri");
		
		//Middle name
		
		driver.findElement(By.id("abc")).sendKeys("R");
		
		//Last name
		
		driver.findElement(By.name("xyz")).sendKeys("Dixit");
		
		//Address
		
		driver.findElement(By.className("address")).sendKeys("Mumbai");

	}

}
