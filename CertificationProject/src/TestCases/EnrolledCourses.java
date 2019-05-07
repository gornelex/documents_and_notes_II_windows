package TestCases;

import org.testng.annotations.Test;

import Utility.ReadExcelFile;
import pomFactoryPages.loginStep;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class EnrolledCourses {
	
	WebDriver driver;
	String path = "C:\\Selenium\\Programs\\CertificationProject\\src\\dataFolder\\dataTest.xlsx";
 


@Test
  public void Test() throws InterruptedException {
	
	pomFactoryPages.EnrolledCourses courseValidate = new pomFactoryPages.EnrolledCourses(driver);
	courseValidate.MyCoursePage();
	Thread.sleep(5000);
	 
	String PageSource = driver.getPageSource();
		
			
	 if(PageSource.contains("It looks like you are not enrolled for any course")){
	        System.out.println("Not enrolled to any course");
	    }
	
	 
	 else
		 
	 {
		 WebElement Course = driver.findElement(By.xpath("//span[@class='name']"));
		 String title = Course.getText();
		 
		
		 
		 
		 System.out.println(title);
		 
	 }
	
	
  }
  
	@BeforeClass
  public void LogInPortal() throws Exception {
	 
		ReadExcelFile readExcelfile = new ReadExcelFile();
		  readExcelfile.setupExcel(path, "Users");
		  
		  String userID = readExcelfile.getData(0, 0);
		  String pass = readExcelfile.getData(0, 1);	
		
		  loginStep LogIn = new loginStep(driver);
		  LogIn.logIn(userID, pass);
	  Thread.sleep(5000);
	  
	  
	  
	  
  }

  @BeforeTest
  public void OpenPage () {
	  driver.manage().window().maximize();
	  driver.get("https://www.edureka.co");
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
  }


  @BeforeSuite
  public void OpenBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\InstallationStuff\\ExeFiles_Browser Drivers\\chromedriver74.0.3729.6_win32.exe");
	  driver = new ChromeDriver();
	  
	
  }

  @AfterSuite
  public void BrowserClose() {
	  
	  driver.close();
  }

}
