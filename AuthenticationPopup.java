package AlertsandPopUPs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://admin:admghghgin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();

	}

}
