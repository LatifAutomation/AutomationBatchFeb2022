package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByvalue {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify the elements
		
		WebElement dropd = driver.findElement(By.id("searchDropdownBox"));
		
		//craete the object of select vlass
		
		Select sel=new Select(dropd);
		
		//Perform the action
		
		sel.selectByValue("search-alias=electronics");
		Thread.sleep(3000);
		
		sel.selectByValue("search-alias=hpc");
		

	}

}
