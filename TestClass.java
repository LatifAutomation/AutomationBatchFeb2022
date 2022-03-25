package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

	public static void main(String[] args) 
	{
		ChromeOptions handlingSSL = new ChromeOptions();

		//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
		handlingSSL.setAcceptInsecureCerts(true);
				
		//Creating instance of Chrome driver by passing reference of ChromeOptions object
		WebDriver driver = new ChromeDriver(handlingSSL);
		
		
		
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.login("testuser234", "Test@1234");
		
		Profile p=new Profile(driver);
		//p.verifyUser("testuser234");
		p.logoutclick();
		
		
	}

}
