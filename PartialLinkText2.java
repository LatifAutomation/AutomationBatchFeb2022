package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
		driver.manage().window().maximize();
		
		//Forgotten password
		
		
		WebElement lname = driver.findElement(By.partialLinkText("?"));
		String text = lname.getText();
		System.out.println(text);
		
		lname.click();
		
		
		
	}

}
