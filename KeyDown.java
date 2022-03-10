package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions act=new Actions(driver);
		
		act.keyDown(ele, Keys.SHIFT).sendKeys("mobile").build().perform();

	}

}
