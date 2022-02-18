package Navigations;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTo {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://www.amazon.in/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.manage().window().maximize();

	}

}
