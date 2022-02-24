package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/HTML3/LinkText3.html");
		driver.manage().window().maximize();
		
		//link1
		
		driver.findElement(By.tagName("a")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		
		//mylink2
		
		driver.findElement(By.linkText("mylink2")).click();
		
		

	}

}
