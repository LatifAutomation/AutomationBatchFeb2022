package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		

	}

}
