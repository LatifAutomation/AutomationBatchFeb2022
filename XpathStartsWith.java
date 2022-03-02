package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStartsWith {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Search
		
		driver.findElement(By.xpath("//input[starts-with(@id,'two')]")).sendKeys("Furniture");
		
	}

}
