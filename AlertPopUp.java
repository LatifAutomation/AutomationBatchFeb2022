package AlertsandPopUPs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) 
	{


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/popups");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("confirmation")).click();
		
		//driver.findElement(By.xpath("//input[@value='Open Multiple Windows']")).click();
		
		//switch focus to Alert
		
		
		Alert alt=driver.switchTo().alert();
		
		String txt = alt.getText();
		
		System.out.println(txt);
		
		
		//Click on OK button
		
		//alt.accept();
		
		
		//Click on Cancel
		
		alt.dismiss();

	}

}
