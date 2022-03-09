package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod {

	public static void main(String[] args) 
	{
		
       WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify the elements
		
		WebElement srcbx = driver.findElement(By.id("twotabsearchtextbox"));
		
		//Create the object of Actions class
		
		
		Actions act=new Actions(driver);
		
		act.sendKeys(srcbx,"Mobile").perform();
		
		WebElement btn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		act.click(btn).perform();
		
	
		
		//
		
	}

}
