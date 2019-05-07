package withoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logOutPage {
	
	WebDriver driver;
	//Constructor
		public logOutPage(WebDriver driver)
		{
			// "this" keyword is used here to distinguish global and local varaible "driver"
			this.driver=driver;

		}
		
		//locators to enter google
		By accountMenu= By.xpath("//*[@class='gb_x gb_Da gb_f']");
		By closeSession= By.xpath("//a[@class='gb_0 gb_Ef gb_Mf gb_le gb_kb']");
		
		
		public void clickOnaccountMenu() {
			driver.findElement(accountMenu).click();
		}
		
		public void clickOncloseSession() {
			driver.findElement(closeSession).click();
		}
		
		
		public void googleLogout() throws InterruptedException {
			clickOnaccountMenu();
			Thread.sleep(2000);
			clickOncloseSession();
		}

}
