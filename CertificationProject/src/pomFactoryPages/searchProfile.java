package pomFactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchProfile {
	
WebDriver driver;
	
	
	public searchProfile(WebDriver driver)
	{
	// "this" keyword is used here to distinguish global and local variable "driver"
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}	


	@FindBy(xpath = "//a[@class='dropdown-toggle trackButton']")
	WebElement toggleUser;
	
	@FindBy(xpath = "//a[@data-button-name='My Profile']")
	WebElement myprofileButton;
	
	
	@FindBy(id = "personal_details")
	WebElement detailsButton;
	
	
	
	public void clickOnUser() {
		toggleUser.click();
	}
	
	public void clickOnProfile() {
		myprofileButton.click();
	}
	
	public void clickOndetails() {
		detailsButton.click();
	}
	
	
	public void AccessToProfile(){
		clickOnUser();
		clickOnProfile();
		clickOndetails();
	}
	
	
	
}
