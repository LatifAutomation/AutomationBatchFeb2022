package AlertsandPopUPs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionpopUp {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.name("email")).sendKeys("tets@tets.com");
		driver.findElement(By.id("did_submit")).click();
	}

}
