package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML3/TagName6.html");
		
		driver.manage().window().maximize();
		
		//First Name
		
		WebElement ele1 = driver.findElement(By.tagName("input"));
		ele1.sendKeys("Selenium");
		
		//Last name
		
		WebElement ele2 = driver.findElement(By.tagName("input"));
		ele2.sendKeys("Testing");
		
		

	}

}
