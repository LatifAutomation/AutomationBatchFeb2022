package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContectClick {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		//
		
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(logo).sendKeys(logo,"I").build().perform();
		
		

	}

}
