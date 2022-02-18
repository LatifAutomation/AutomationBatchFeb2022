package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args)
	{
		
		ChromeDriver abc=new ChromeDriver();
		
		abc.get("https://www.facebook.com/");
		
		String exptitle="Facebook – log in or sign up";
		
	    String title = abc.getTitle();
	    
		System.out.println(title);

	}

}
