package withoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class openGmail {

	WebDriver driver;
	
	// Constructor
	public openGmail(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		this.driver=driver;
	}
	
	//locators to enter googleApps and  gmailApp
	By googleApps= By.xpath("//a[@class='gb_x gb_Vb']");
	By gmailApp= By.id("gb23");

	
	public void clickOngoogleApps() {
		driver.findElement(googleApps).click();
	}
	
	public void clickOngmailApp() {
		driver.findElement(gmailApp).click();
	}
	
}
