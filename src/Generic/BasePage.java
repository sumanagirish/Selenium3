package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public WebDriver dr;
	
	
	public BasePage(WebDriver driver) {
		this.dr = driver;
	}


	public void titleWait(String title)
	{
		WebDriverWait wait = new WebDriverWait(dr, 10);
		try
		{
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("title is matching", true);
		}
		catch(Exception e)
		{
			
			Reporter.log("title is not matching", true);
			Assert.fail();
		}
		
		
	}
	
	public void elementVisibility(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(dr, 10);
		try
		{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is visible", true);
		}
		catch(Exception e)
		{
			
			Reporter.log("Element is not visible", true);
			Assert.fail();
		}
		
		
	}

}
