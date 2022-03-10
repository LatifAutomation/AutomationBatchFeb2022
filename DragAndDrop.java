package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.id("div1"));
		
		WebElement dest = driver.findElement(By.id("div2"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(src, dest).build().perform();
		
		

	}

}
