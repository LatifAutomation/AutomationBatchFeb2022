package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.gecko.driver", "D://ChromeSetup/geckodriver.exe");
		
		ChromeDriver  driver=new ChromeDriver();
		
		driver.get("https://www.educative.io/");// Open the url
		
		driver.close();//close the window

	}

}
