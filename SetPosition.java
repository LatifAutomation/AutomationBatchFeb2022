package Basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Point p=new Point(120,150);
		driver.manage().window().setPosition(p);
		
		int xaxis = driver.manage().window().getPosition().getX();
		System.out.println(xaxis);
		
		int yaxis = driver.manage().window().getPosition().getY();
		System.out.println(yaxis);

	}

}
