package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedoptions {

	public static void main(String[] args) 
	{
WebDriver driver=new ChromeDriver();
   		
		driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		driver.manage().window().maximize();
		
		//Identify
		
		WebElement drp = driver.findElement(By.id("cars"));
		
		
		Select sel=new Select(drp);
		
		sel.selectByIndex(0);
		sel.selectByValue("volvo");
		sel.selectByVisibleText("Opel");
		sel.selectByValue("maruti");
		
		
		
		//GetAllSelectedoption
		
		List<WebElement> opt = sel.getAllSelectedOptions();
		
		int sz = opt.size();
		
		System.out.println(sz);
		
		
		for(int i=0;i<sz;i++)
		{
			WebElement ele = opt.get(i);
			//String txt = ele.getText();
			//System.out.println(txt);
			
			System.out.println(ele.getText());
		}

	}

}
