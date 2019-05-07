package withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;
	
	// Constructor
	public loginPage(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// locator google login and enter to gmail
			@FindBy(id = "identifierId")
			WebElement emailID;
			@FindBy(xpath = "//span[@class='RveJvd snByac']")
			WebElement nextButton;
			@FindBy(name = "password")
			WebElement pass;
			
			
			//type email address
			public void typeEmailAddress(String emailAddress)
			{
				emailID.sendKeys(emailAddress);
			}
			
			// Type password
			public void typePassword(String password)
			{
					pass.sendKeys(password);
			}
			
			// Method to click on sign in and next button
				public void clickOnNextButton()
			{
					nextButton.click();
				
			}
			
}
