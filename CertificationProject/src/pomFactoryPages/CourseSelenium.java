package pomFactoryPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseSelenium {
	
	WebDriver driver;
	JavascriptExecutor jse;
	
	public CourseSelenium(WebDriver driver)
	{
	// "this" keyword is used here to distinguish global and local varaible "driver"
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search-inp")
	WebElement SearchCourse;
	
	@FindBy(xpath = "//div[@id='add-training-courses']//a[1]")
	WebElement SelectCourse;
	
	@FindBy(xpath = "//a[@class='trackButton enroll-clp-btn orange_btn on_hide_this_show_other ga-click']")
	WebElement EnrollToCourse;
	
	@FindBy(xpath = "//div[@class='pull-right new_widthadd_btn']//button[@class='pymt_btn pymt_btn_batch osp_ga'][contains(text(),'PROCEED TO PAYMENT')]")
	WebElement ButtontoPayment;
	
	public void typeKeysearchCourse(String Course) {
		SearchCourse.sendKeys(Course, Keys.ENTER);
	}
	
	public void clickOnPayment() {
		ButtontoPayment.click();
	}
	
	public void clickOnSelectCourse() {
		SelectCourse.click();
	}


	public void clickOnEnrollToCourse() {
		EnrollToCourse.click();
	}
	
	
	public void scrollDown300 () {
		jse = (JavascriptExecutor )driver;
		jse.executeScript("scroll(0, 300)");
	}
	
	
	public void EnrollToCourse(String Course) throws InterruptedException {
		
		typeKeysearchCourse(Course);
		clickOnSelectCourse();
		Thread.sleep(5000);
		if(driver.getPageSource().contains("START LEARNING")){
		        System.out.println("You were enrolled to this course");
		        driver.close();
		    }
		else {
		
		scrollDown300 ();
		Thread.sleep(3000);
		clickOnEnrollToCourse();
		Thread.sleep(3000);
		clickOnPayment();
		Thread.sleep(3000);
		
		}
		
	}
		

}