package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify the elements
		
		WebElement dropd = driver.findElement(By.id("searchDropdownBox"));
		
		//craete the object of select vlass
		
		Select sel=new Select(dropd);
		
		//Perform the action
		
		sel.selectByVisibleText("Music");
		
		
		

	}

}
