package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoptions {

	public static void main(String[] args) 
	{
       
		
		WebDriver driver=new ChromeDriver();
   		
		driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		driver.manage().window().maximize();
		
		//Identify
		
		WebElement drp = driver.findElement(By.id("cars"));
		
		
		Select sel=new Select(drp);
		
		List<WebElement> opt = sel.getOptions();
		
		int sz = opt.size();
		
		System.out.println(sz);
		
		
	/*	for(int i=0;i<sz;i++)
		{
			WebElement ele = opt.get(i);
			
			String txt = ele.getText();
			
			System.out.println(txt);
		}
*/
		
		
		for(WebElement str:opt)
		{
			String text = str.getText();
			System.out.println(text);
		}
	}

}
