package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
       // Dimension d=new Dimension(400,550);
		
		//driver.manage().window().setSize(d);
		
		int hgt = driver.manage().window().getSize().getHeight();
		System.out.println(hgt);
		
		int wdt = driver.manage().window().getSize().getWidth();
		System.out.println(wdt);
		
		
		
		
		
	}

}
