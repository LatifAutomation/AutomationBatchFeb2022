package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorByID {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Test@1234");
		

	}

}
