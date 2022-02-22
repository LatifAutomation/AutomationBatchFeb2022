package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML3/TagName5.html");
		
		driver.manage().window().maximize();
		
		// Identify the elements by using tagname
		
		
		//driver.findElement(By.tagName("input")).sendKeys("Automation Testing");
		
	
		/*WebElement ele = driver.findElement(By.tagName("input"));
		ele.sendKeys("Sample");*/
		
		By abc = By.tagName("input");
		
		WebElement pqr = driver.findElement(abc);
		
		pqr.sendKeys("Hello");
		

	}

}
