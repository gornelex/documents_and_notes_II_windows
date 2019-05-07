package pomFactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginStep {
	
	WebDriver driver;
	
	
	public loginStep(WebDriver driver)
	{
	// "this" keyword is used here to distinguish global and local variable "driver"
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='signin top-signin giTrackElementHeader hidden-xs']")
	WebElement LogButton;
	
	@FindBy(id = "si_popup_email")
	WebElement emailID;
	
	@FindBy(id = "si_popup_passwd")
	WebElement passwd;
	
	@FindBy(xpath = "//button[@class='clik_btn_log btn-block']")
	WebElement LogAccept;
	
	
	public void clickOnLogButton() {
		LogButton.click();
	}
	
	public void typeKeysEmailID(String UserID) {
		emailID.sendKeys(UserID);
	}
	
	public void typeKeysPassword(String Password) {
		passwd.sendKeys(Password);
	}
	
	public void clickOnAccept() {
		LogAccept.click();
	}
	
	public void logIn(String UserID, String Password) throws InterruptedException
	{
		clickOnLogButton();
		Thread.sleep(3000);
		typeKeysEmailID(UserID);
		typeKeysPassword(Password);
		clickOnAccept();
		
		System.out.println("Login Sucessfully");
	}
	

}
