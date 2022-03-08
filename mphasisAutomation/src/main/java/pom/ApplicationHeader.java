package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {

	@FindBy ( xpath = "//div[text()='Time-Track']")
	private WebElement timeTrack;
	
	@FindBy ( xpath = "//div[text()='Tasks']")
	private WebElement task;
	
	@FindBy ( xpath = "//div[text()='Reports']")
	private WebElement report;
	
	@FindBy ( xpath = "//div[text()='Users']")
	private WebElement user;
	
	@FindBy ( xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	public ApplicationHeader(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	
	public void openTimeTrack()
	{
		timeTrack.click();
	}
	public void openTaskPage()
	{
		task.click();
	}
	public void openReportTab()
	{
		report.click();
	}
	public void openUserPage()
	{
		user.click();
	}
	public void logout()
	{
		logout.click();
	}
} 
