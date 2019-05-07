package withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage {
	
	WebDriver driver;
	
	// Constructor
		public mainPage(WebDriver driver)
		{
			// "this" keyword is used here to distinguish global and local varaible "driver"
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		// locator google login and enter to gmail
		@FindBy(xpath="//a[@id='gb_70']")
		WebElement google_session;
		
		// Method to click on sign in button
		public void clickOngoogleSession()
			{
				google_session.click();
			}
}
