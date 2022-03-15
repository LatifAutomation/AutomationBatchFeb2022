package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("nav-search-submit-button")));
		
       driver.findElement(By.id("nav-search-submit-button")).click();
		
		
	}

}
