package withoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

WebDriver driver;

//Constructor
	public loginPage(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		this.driver=driver;

	}
	
	//locators to enter google
	By emailID = By.id("identifierId");
	By nextButton = By.xpath("//span[@class='RveJvd snByac']");
	By pass = By.name("password");
	
	//type email address
	public void typeEmailAddress(String emailAddress)
	{
		driver.findElement(emailID).sendKeys(emailAddress);
	}
	
	// Type password
	public void typePassword(String password)
	{
			driver.findElement(pass).sendKeys(password);
	}
	
	// Method to click on sign in and next button
		public void clickOnNextButton()
	{
			driver.findElement(nextButton).click();
		
	}
	
}
