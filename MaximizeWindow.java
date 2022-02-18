package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().fullscreen();
		
		
		
		
	}

}
