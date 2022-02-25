package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/HTML3/CSSSelector3.html");
		
		driver.manage().window().maximize();
		
		// first Name
		
		driver.findElement(By.cssSelector("input[id='fname']")).sendKeys("Akshay");
		
		//Middle Name
		driver.findElement(By.cssSelector("input[name='second']")).sendKeys("vikas");
		
		
		//Last  Name
		
		driver.findElement(By.cssSelector("input[class='laname']")).sendKeys("Mishra");

	}

}
