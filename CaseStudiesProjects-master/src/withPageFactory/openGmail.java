package withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class openGmail {
	
WebDriver driver;
	
	// Constructor
	public openGmail(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='gb_x gb_Vb']")
	WebElement googleApps;
	@FindBy(id = "gb23")
	WebElement gmailApp;
	
	public void clickOngoogleApps() {
		googleApps.click();
	}
	
	public void clickOngmailApp() {
		gmailApp.click();
	}
	
	

}
