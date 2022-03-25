package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistartionPage 
{

	WebDriver driver;
	
	private WebElement myacc;
	private WebElement reglink;
	private WebElement fname;
	private WebElement lastname;
	private WebElement email;
	private WebElement telephone;
	private WebElement pass;
	private WebElement confpass;
	private WebElement checkbox;
	private WebElement contbtn;
	
	
	
	
	public RegistartionPage(WebDriver driver)
	{
		this.driver=driver;
		myacc=driver.findElement(By.xpath("//a[@title='My Account']"));
		reglink=driver.findElement(By.linkText("Register"));
		fname=driver.findElement(By.id("input-firstname"));
		lastname=driver.findElement(By.id("input-lastname"));
		email=driver.findElement(By.id("input-email"));
		telephone=driver.findElement(By.id("input-telephone"));
		pass=driver.findElement(By.id("input-password"));
		confpass=driver.findElement(By.id("input-confirm"));
		checkbox=driver.findElement(By.name("agree"));
		contbtn=driver.findElement(By.xpath("//input[@value='Continue']"));
		
	}
	
	
	
	//utilization
	
	
	public void myaccountclick()
	{
		myacc.click();
	}
	
	public void clickRegister()
	{
		reglink.click();
	}
	
	
	public void enterfname()
	{
		fname.sendKeys("Sonali");
	}
	
	public void enterlastname()
	{
		lastname.sendKeys("Mhaskar");
	}
	public void enteremail()
	{
		email.sendKeys("sonalimhaskar27@gmail.com");
	}
	
	public void enterphone()
	{
		telephone.sendKeys("9874563210");
	}
	
	public void enterpass()
	{
		pass.sendKeys("Test@1234");
	}
	
	public void confirmpass()
	{
		confpass.sendKeys("Test@1234");
	}
	
	
	public void checkboxclick()
	{
		checkbox.click();
	}
	
	public void continueclick()
	{
		contbtn.click();
	}
	
	
}
