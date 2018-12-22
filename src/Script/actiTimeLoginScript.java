package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.FetchLoginCredentials;
import POM.actiTimeLogin;

public class actiTimeLoginScript extends BaseTest {
	
	@Test
	public void Test1() throws Throwable
	{
		actiTimeLogin login = new actiTimeLogin(driver);
		login.setUsername(FetchLoginCredentials.getData(excelPath, "Sheet1", 0, 1));
		login.setPassword(FetchLoginCredentials.getData(excelPath, "Sheet1", 1, 1));
		login.clickLogin();
		login.titleWait("Enter");
		
		
		
		
		
	}
	
	

}
