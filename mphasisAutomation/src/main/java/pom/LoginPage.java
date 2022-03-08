package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy ( xpath = "//input[@id='username']")
	private WebElement userName;
	
	@FindBy ( xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy ( xpath = "//input[@id='keepLoggedInCheckBox']")
	private WebElement keepLoggedInCheckBox;
	
	@FindBy ( xpath = "//a[@id='loginButton']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	
	public void sendUserName(){
		userName.sendKeys("admin");
	}
	public void sendPassword(){
		password.sendKeys("manager");
	}
	public void keepLoggedInCheckBox(){
		keepLoggedInCheckBox.click();
	}
	public void clickloginButton(){
		loginButton.click();
	}
	
	
	
	
	
	
	
	
}
