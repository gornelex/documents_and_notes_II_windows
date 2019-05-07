package pomFactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EnrolledCourses {
	
	WebDriver driver;
	
	public EnrolledCourses(WebDriver driver)
	{
	// "this" keyword is used here to distinguish global and local variable "driver"
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}

	//Locators
	@FindBy(xpath = "//a[@id='dropdownMenu3']")
	WebElement CoursesButton;
	@FindBy(xpath = "//li[@class='ga_ecom_info']//a[@class='ga_header_info giTrackElementHeader'][contains(text(),'My Classroom')]")
	WebElement MyclassroomButton;
	
	
	//Function of the locators
	public void clickOnCoursesButton() {
		CoursesButton.click();
	}
	
	public void clickOnClassroomButton() {
		MyclassroomButton.click();
	}
	
	
	public void MyCoursePage() {
		clickOnCoursesButton();
		clickOnClassroomButton();
		}
	
}