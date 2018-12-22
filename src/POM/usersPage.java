package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class usersPage extends BasePage {
	
	@FindBy(xpath="//div[contains(text(),'USERS')]")
	private WebElement users;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public usersPage(WebDriver dr)
	{
		super(dr);
		PageFactory.initElements(dr, this);
	}
	
	public void clickUsers()
	{
		this.users.click();
	}
	
	public void clickLogout()
	{
		this.logout.click();
	}

}
