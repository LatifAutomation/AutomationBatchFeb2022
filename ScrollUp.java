package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  
	  Actions act=new Actions(driver);
	  
	  act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	  
	  Thread.sleep(3000);
	  
	  act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	  
	  

	}

}
