package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutoConstant {
	
	static
	{
		System.setProperty(chromeKey, chromeValue);
		System.setProperty(geckoKey, geckoValue);
	}
	
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(String browser)
	{
		if(browser.equals("chrome"))
		driver=new ChromeDriver();
		else
			driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterMethod(ITestResult result)
	{
		int status=result.getStatus();
		String name=result.getMethod().getMethodName();// returns the name of the method
		Scrennshotclass.getScreenShot(driver,name);//using screenshot method here because, to capture screen shot after the method is failed.
		driver.close();
	}

}
