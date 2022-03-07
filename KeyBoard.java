package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KeyBoard {

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Drop down
		
		
		WebElement drp = driver.findElement(By.id("searchDropdownBox"));
		drp.click();
		
		
		
		
		drp.sendKeys(Keys.ARROW_DOWN);
		
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		
		drp.sendKeys(Keys.ENTER);

	}

}
