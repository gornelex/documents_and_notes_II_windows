package withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOutPage {
	
	WebDriver driver;
	
	// Constructor
	public logOutPage(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//*[@class='gb_x gb_Da gb_f']")
	WebElement accountMenu;
	@FindBy(xpath = "//a[@class='gb_0 gb_Ef gb_Mf gb_le gb_kb']")
	WebElement closeSession;
	
	public void clickOnaccountMenu() {
		accountMenu.click();
	}
	
	public void clickOncloseSession() {
		closeSession.click();
	}
	
	
	public void googleLogout() throws InterruptedException {
		clickOnaccountMenu();
		Thread.sleep(2000);
		clickOncloseSession();
	}
	
	
}
