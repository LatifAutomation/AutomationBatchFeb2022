package PageFatory_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage 
{

	WebDriver driver;
	
	
	@FindBy(xpath="//h1")
	
	WebElement header;
	
	@FindBy(id="signupModalButton")
	
	WebElement signupbtn;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void headerVerify()
	{
		String expectedtitle = "App & Browser Testing Made Easy";
		String actualtitle = header.getText();
		Assert.assertEquals(expectedtitle,actualtitle);
		
	}
	
	
	public void signupclick()
	{
		signupbtn.click();
	}
}
