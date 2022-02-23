package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/pc/Desktop/HTML3/ID3.html");
	driver.manage().window().maximize();
	
	//First Name
	
	WebElement fname = driver.findElement(By.tagName("input"));
	
	fname.sendKeys("Selenium");
	
	//Last Name
	
	WebElement lname = driver.findElement(By.id("abc"));
	
	lname.sendKeys("Tesing");
	
	}

}
