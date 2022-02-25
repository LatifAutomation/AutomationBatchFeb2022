package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML3/PartialLinkText.html");
		
		driver.manage().window().maximize();
		
		//Link2
		
		String name = driver.findElement(By.partialLinkText("2")).getText();
		
		System.out.println(name);

		//Link3
		
		driver.findElement(By.partialLinkText("3")).click();
		
		
	}

}
