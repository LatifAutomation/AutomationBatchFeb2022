package Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Get {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D://ChromeSetup/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
		
		
		

	}

}
