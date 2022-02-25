package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CSSSelector2 {

	public static void main(String[] args)
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//search 
		
		//driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Mobile");
		
		//driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		WebElement ele = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.partialLinkText("Your Account")).click();
		
	}

}
