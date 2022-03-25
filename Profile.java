package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile 
{

	@FindBy(id="userName-value")
	WebElement user;
	
	@FindBy(id="submit")
	WebElement logout;
	
	
	public Profile(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void verifyUser(String username)
	{
		if(user.getText().equalsIgnoreCase(username))
		{
			System.out.println("Correct User login"+user.getText());
		}
		
		else
		{
			System.out.println("Invalid user has logged");
		}
	}
	public void logoutclick()
	{
		logout.click();
	}
}
