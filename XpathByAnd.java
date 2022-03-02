package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAnd {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		//Search field
		
		driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("Cloths");

	}

}
