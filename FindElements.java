package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Findelements
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int sz = links.size();
		
		System.out.println(sz);
		
		int count=0;
		for(int i=0;i<sz;i++)
		{
			
			WebElement ele = links.get(i);
			
			if(ele.isDisplayed())
			{
			 
			String text = ele.getText();
			
			System.out.println(text);
			count++;
			
			}
			
			
		}
		
		System.out.println(count);
		
		
		
		
		
	}

}
