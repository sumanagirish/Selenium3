package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionItems {
	

	public void doubleClick(WebDriver dr,WebElement element)
	{
	  Actions act=new Actions(dr);
	  act.doubleClick();
	}
	
	public void rightClick(WebDriver dr,WebElement element)
	{
	  Actions act=new Actions(dr);
	  act.contextClick();
	}
	
	public void dragDrop(WebDriver dr,WebElement source,WebElement dest)
	{
	  Actions act=new Actions(dr);
	  act.dragAndDrop(source, dest);
	}
	
	public void mouseHover(WebDriver dr,WebElement element)
	{
	  Actions act=new Actions(dr);
	  act.moveToElement(element);
	}
	
	

}
