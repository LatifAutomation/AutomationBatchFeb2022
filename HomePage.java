package PageObjectModel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{

	WebDriver driver;
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	//Locate the elements
	
	
	By logingbtn=By.id("login");
	
	//Method for action
	
	public void loginClick()
	{
		driver.findElement(logingbtn).click();
	}
	
	
}
