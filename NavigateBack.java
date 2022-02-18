package Navigations;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		String title1 = driver.getTitle();
		
		System.out.println(title1);
		
		String url1 = driver.getCurrentUrl();
		
		System.out.println(url1);
		
		driver.navigate().to("https://www.facebook.com/");
		
        String title2 = driver.getTitle();
		
		System.out.println(title2);
		
		String url2 = driver.getCurrentUrl();
		
		System.out.println(url2);
		
		Thread.sleep(300);
		
		//Back Navigate
		
		driver.navigate().back();
		
		
        String title3 = driver.getTitle();
		
		System.out.println(title3);
		
		String url3 = driver.getCurrentUrl();
		
		System.out.println(url3);
		
		Thread.sleep(300);
		
		//Navigate forward
		
		driver.navigate().forward();
		
        String title4 = driver.getTitle();
		
		System.out.println(title4);
		
		String url4 = driver.getCurrentUrl();
		
		System.out.println(url4);
		
		Thread.sleep(300);
		
		// Refresh the page
		
		 driver.navigate().refresh();
		
		   String title5 = driver.getTitle();
			
			System.out.println(title5);
			
			String url5 = driver.getCurrentUrl();
			
			System.out.println(url5);
		

	}

}
