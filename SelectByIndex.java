package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify the element
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//Craete a object of select class
		
		
		Select sel=new Select(drop);
		
		
		//Perform the action
		
		sel.selectByIndex(190);
		
		
		
	}

}
