package withoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainPage {
	
	WebDriver driver;
	
	// Constructor
	public mainPage(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		this.driver=driver;
	}
	
	// locator google login and enter to gmail
		By google_session= By.xpath("//a[@id='gb_70']");
		
		
		// Method to click on sign in button
	public void clickOnSignInButton()
		{
			driver.findElement(google_session).click();
		}

		
}
