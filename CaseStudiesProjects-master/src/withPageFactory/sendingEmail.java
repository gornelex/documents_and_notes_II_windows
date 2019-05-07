package withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sendingEmail {
	
	WebDriver driver;
	
	// Constructor
	public sendingEmail(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='T-I J-J5-Ji T-I-KE L3']")
	WebElement newEmail;
	
	@FindBy(name = "to")
	WebElement recipients;
	
	@FindBy(name = "subjectbox")
	WebElement subject;
	
	@FindBy(xpath = "//*[@class='Am Al editable LW-avf']")
	WebElement emailMessage;
	
	@FindBy(xpath = "//*[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	WebElement send;
	
	public void clickOnredactEmail() {
		newEmail.click();
	}
	
	public void typeKeysrecipients(String emailRecipients) {
		recipients.sendKeys(emailRecipients);
	}
	
	public void typeKeyssubject(String suBject) {
		subject.sendKeys(suBject);
	}
	
	public void typeKeysemailMessage(String textMessage) {
		emailMessage.sendKeys(textMessage);
		
	}
	
	public void clickOnsend() {
		send.click();
	}
	
	public void sendEmail(String emailRecipients, String suBject, String textMessage) throws InterruptedException
	{
		typeKeysrecipients(emailRecipients);
		typeKeyssubject(suBject);
		typeKeysemailMessage(textMessage);
		Thread.sleep(2000);
		clickOnsend();
	}

}
