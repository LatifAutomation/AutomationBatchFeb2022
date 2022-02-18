package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String tit = driver.getTitle();
		System.out.println(tit);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		

	}

}
