package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		
		WebElement srcbtn = driver.findElement(By.id("nav-search-submit-button"));
		boolean out = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		System.out.println(out);
		if(srcbtn.isEnabled())
		{
			srcbtn.click();
		}
		
		else
		{
			System.out.println(srcbtn+"is not enabled");
		}

	}

}
