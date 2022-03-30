package PageFatory_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUppage 
{

	WebDriver driver;
	
	@FindBy(id="user_full_name")
	WebElement fullname;
	
	@FindBy(id="user_email_login")
	WebElement email;
	
	
	@FindBy(id="user_password")
	WebElement password;
	
	@FindBy(id="tnc_checkbox")
	WebElement checkbox;
	
	@FindBy(id="user_submit")
	WebElement signupbtn;
	
	public SignUppage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void fullnameEnter()
	{
		fullname.sendKeys("Anuradha Ghatge");
	}
	
	
	public void EmailEnter()
	{
		email.sendKeys("anuradhamohite24@gmail.com");
	}
	
	public void passwordEnter()
	{
		password.sendKeys("Test@1234");
	}
	
	public void chckbxclick()
	{
		checkbox.click();
	}
	
	
	public void signUpClick()
	{
		signupbtn.click();
	}
	
	
}
