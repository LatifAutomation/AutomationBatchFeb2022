package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByvalue extends ReusableMethods

{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify the elements
		
		WebElement dropd = driver.findElement(By.id("searchDropdownBox"));
		
		ReusableMethods ru=new ReusableMethods();
		ru.selectByIndex(dropd, 0);
		ru.selectByvalue(dropd, "search-alias=lawngarden");
		ru.selectByVisibleText(dropd, "Luggage & Bags");
		
		

	}

}
