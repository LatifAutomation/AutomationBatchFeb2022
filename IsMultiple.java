package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		driver.manage().window().maximize();
		
		//Identift 
		
		WebElement drp = driver.findElement(By.name("cars"));
		
		//Craete ob
		
		Select sel=new Select(drp);
		
		sel.selectByIndex(2);

		if(sel.isMultiple())
		{
			Thread.sleep(2000);
			sel.deselectByIndex(2);
		}
		
		else
		{
			System.out.println("Drop down is not multi selected ");
		}
		
	}

}
