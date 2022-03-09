package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/popups");
		
		driver.manage().window().maximize();
		
		//
		WebElement ele = driver.findElement(By.id("double-click"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(ele).perform();
		
		
		

	}

}
