package AlertsandPopUPs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsbasedPopuP {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/popups#");
		
		//Parent window reference Id
		
		
		String pid = driver.getWindowHandle();
		
		System.out.println(pid);
		
		driver.findElement(By.xpath("//input[@value='Open Multiple Windows']")).click();
		
		Set<String> cid = driver.getWindowHandles();
		
		System.out.println(cid);
		
		
		Iterator<String> it=cid.iterator();
		
		while(it.hasNext())
		{
			
			driver.switchTo().window(it.next());
			
			String title = driver.getTitle();
			
			System.out.println(title);
		}
		
		

	}

}
