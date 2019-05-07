package withoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sendingEmail {
	
WebDriver driver;
	
	// Constructor
	public sendingEmail(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		this.driver=driver;
	}
	
	//locator to redact email
	By newEmail = By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']");
	By recipients = By.name("to");
	By subject = By.name("subjectbox");
	By emailMessage = By.xpath("//*[@class='Am Al editable LW-avf']");
	By send = By.xpath("//*[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']");
	
	
	public void clickOnredactEmail() {
		driver.findElement(newEmail).click();
	}
	
	public void typeKeysrecipients(String emailRecipients) {
		driver.findElement(recipients).sendKeys(emailRecipients);
	}
	
	public void typeKeyssubject(String suBject) {
		driver.findElement(subject).sendKeys(suBject);
	}
	
	public void typeKeysemailMessage(String textMessage) {
		driver.findElement(emailMessage).sendKeys(textMessage);
		
	}
	
	public void clickOnsend() {
		driver.findElement(send).click();
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
