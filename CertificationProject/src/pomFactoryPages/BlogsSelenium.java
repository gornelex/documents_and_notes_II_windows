package pomFactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogsSelenium {
	
	WebDriver driver;
	
	public BlogsSelenium(WebDriver driver)
	{
	// "this" keyword is used here to distinguish global and local variable "driver"
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='dropdownMenu4']")
	WebElement CommunityButton;
	@FindBy(xpath = "//li[@class='ga-blog ga_ecom_info']//a[@class='giTrackElementHeader'][contains(text(),'Blog')]")
	WebElement blogsButton;
	
	@FindBy(xpath = "//a[@data-category='Software Testing']")
	WebElement seleniumButton;
	@FindBy(xpath = "//a[contains(text(),'READ MORE')]")
	WebElement readMoreButton;
	
	
	public void clickOncommunity() {
		CommunityButton.click();
	}
	
	public void clickOnblogs() {
		blogsButton.click();
	}
	
	public void clickOnselenium() {
		seleniumButton.click();
	}
	
	public void clickOnreadMore() {
		readMoreButton.click();
	}
	
	
	public void AccessToBlogs() {
		clickOncommunity();
		clickOnblogs();
		
	}
	
	public void AccessToSeleniumBlogs() throws InterruptedException {
		clickOnselenium();
		Thread.sleep(5000);
		
		clickOnreadMore();
		
	}
	
	
	

}
