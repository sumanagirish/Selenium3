package Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectItems {
	
	public void selectValue(WebElement element,String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void selectIndex(WebElement element,int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public void selectVisiblitiy(WebElement element,String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void unSelectAll(WebElement element)
	{
		Select s = new Select(element);
		s.deselectAll();
	}
	
	public void unSelectByValue(WebElement element)
	{
		Select s = new Select(element);
		s.deselectAll();
	}

}
