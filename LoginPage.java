package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
   @FindBy(id="userName")
   WebElement username;
   
   
   @FindBy(id="password")
   WebElement pwd;
   
   @FindBy(id="login")
   WebElement lognbtn;
	
	
  /* public void enterusername()
   {
	
	   username.sendKeys("test@gmail.com");
	   
   }
   
   
   public void enterPassword()
   {
	   pwd.sendKeys("Test@1234");
   }
   
   
   
   public void loginClick()
   {
	   
	   lognbtn.click();
   }*/
   
   
   
   public void login(String un,String pawd)
   {
	   username.sendKeys(un);
       pwd.sendKeys(pawd); 
       lognbtn.click();
       

   }
}
