package PageFatory_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass
{

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority=0)
	public void HomePageTestcase()
	{
		HomePage hp=new HomePage(driver);
		hp.headerVerify();
		hp.signupclick();
	}
	
	
	@Test(priority=1)
	public void SignUpTestCase() throws InterruptedException
	{
		SignUppage sp=new SignUppage(driver);
		sp.fullnameEnter();
		sp.EmailEnter();
		sp.passwordEnter();
		Thread.sleep(300);
		sp.chckbxclick();
		sp.signUpClick();
		
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	
}
