package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedoptions {

	public static void main(String[] args) 
	{
         WebDriver driver=new ChromeDriver();
   		
		driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		driver.manage().window().maximize();
		
		//Identify
		
		WebElement drp = driver.findElement(By.id("cars"));
		
		
		Select sel=new Select(drp);
				
		sel.selectByValue("maruti");
		//sel.selectByIndex(0);
		sel.selectByValue("volvo");
		sel.selectByVisibleText("Opel");
		
		WebElement ele = sel.getFirstSelectedOption();
		System.out.println(ele.getText());
		

	}

}
