package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Email
		
		driver.findElement(By.xpath("//input[@name='email' or @placeholder='Email addrkjfrgkkjkess or phone number']")).sendKeys("testz2@test.com");
		
		//Password
		driver.findElement(By.xpath("//input[@name='pass' or @data-testid='royal_pass']")).sendKeys("Tetsw@e234");

		//Login button
		
		driver.findElement(By.xpath("//button[contains(@id,\"u_0_d\")]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).isDisplayed());
		
	}

}
