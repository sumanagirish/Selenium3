package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.FetchLoginCredentials;
import POM.actiTimeLogin;
import POM.usersPage;

public class usersPageScript extends BaseTest {
	
		@Test
	public void Test1() throws Throwable
	{
		actiTimeLogin login = new actiTimeLogin(driver);
		login.setUsername(FetchLoginCredentials.getData(excelPath, "Sheet1", 0, 1));
		login.setPassword(FetchLoginCredentials.getData(excelPath, "Sheet1", 1, 1));
		login.clickLogin();
		login.titleWait("Enter");
		
		usersPage users = new usersPage(driver);
		users.clickUsers();
		users.clickLogout();
	}
		

}
