package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CaseStudy_module6 {
	
	WebDriver driver;
	String user = ""; //add edureka.co user 
	String password = ""; //add edureka.co password
	String phoneNumber = "";//add a valid phone number 
	
	
	
  @Test
  public void UserRegisterValidation() throws Exception{
	  
	  
	  		try {
				driver.findElement(By.linkText("Sign Up")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.id("sg_popup_email")).click();
				driver.findElement(By.id("sg_popup_email")).clear();
				driver.findElement(By.id("sg_popup_email")).sendKeys(user);
				
				
				driver.findElement(By.id("sg_popup_phone_no")).click();
				driver.findElement(By.id("sg_popup_phone_no")).clear();
				driver.findElement(By.id("sg_popup_phone_no")).sendKeys(phoneNumber);;
				
				driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block signup-new-submit']")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.name("data[User][password]")).sendKeys("password123456789");
				Thread.sleep(3000);
			

				
			} catch (Exception e) {
				
				WebElement ExceptionError = driver.findElement(By.xpath("//*[@id='emailError']"));
				String msjerror = ExceptionError.getText();
				System.out.println("Error Messaje:" + msjerror);
			}
			

		
	
  }


  @BeforeTest
  public void BrowseAllCourses() throws InterruptedException {
	  
	  	LogIn();
	  	
	  	driver.findElement(By.xpath("//a[@data-button-name='Browse Courses']")).click();
	  	Thread.sleep(3000);
	  	
	  	LogOut();
		
	 
  }

 

  @BeforeSuite
  public void OpenChrome() {
	  //Open Browser
	  System.setProperty("webdriver.chrome.driver", "/home/gornelex/Selenium/InstallationStuff/ExeFiles/chromedriver73.0.3683.68_linux64");
		driver = new ChromeDriver();
		
		//Open Edureka.co page
		driver.get("https://www.edureka.co/");
  }

  @AfterSuite
  public void CloseBrowser() {
	  driver.close();
  }
  
  
  public void LogIn() throws InterruptedException {
	   	//Enter to Login window
	  	driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		
		// Enter UserID
		driver.findElement(By.id("si_popup_email")).sendKeys(user);
		driver.findElement(By.id("si_popup_passwd")).sendKeys(password);;
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		Thread.sleep(3000);
		
	  
  }
  
  public void LogOut() throws InterruptedException {
	  
	//Logout
			driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']")).click();
			driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div/ul[2]/li[1]/ul/li[7]/a")).click();
			Thread.sleep(2000);
  }

}
