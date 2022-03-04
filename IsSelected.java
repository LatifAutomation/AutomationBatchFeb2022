package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//drop down
		WebElement drp = driver.findElement(By.xpath("//option[@value='search-alias=alexa-skills']"));
		
		if(drp.isSelected())
		{
			System.out.println("Drop down is selected one");
			//drp.click();
		}

		else
		{
			System.out.println(drp.getText()+"is not selected");
		}
		
		
	}

}
