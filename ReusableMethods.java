package DropDown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableMethods 
{

	
	public void selectByIndex(WebElement dropdown,int indexno)
	{
		Select sel=new Select(dropdown);
		sel.selectByIndex(indexno);
	}
	
	public void selectByvalue(WebElement dropdown,String str)
	{
		Select sel=new Select(dropdown);
		sel.selectByValue(str);
		
	}
	
	
	public void selectByVisibleText(WebElement dropdown,String text)
	{
		Select sel=new Select(dropdown);
		sel.selectByVisibleText(text);
	
}

}