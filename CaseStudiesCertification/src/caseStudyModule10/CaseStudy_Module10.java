package caseStudyModule10;

import org.testng.annotations.Test;

import caseStudyModule9.ReadExcelFile;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CaseStudy_Module10 {
	
	WebDriver driver;
	String path = "C:\\Selenium\\Programs\\CaseStudiesCertification\\src\\caseStudyModule10\\TestData\\UserData.xlsx";
	
  @Test
  public void MyTestCases() throws Exception {
	  ReadExcelFile.setupExcel(path, "User");   	
	 //Login
	  
	  	String userID = ReadExcelFile.getData(0, 0);
		String pass = ReadExcelFile.getData(0, 1);
		
	  LogIn logIN = new LogIn(driver);
	  logIN.logIn(userID, pass);
	  
	  //Enroll to a course 
	  Thread.sleep(3000);
	  CourseSearch enroll = new CourseSearch(driver);
	  enroll.EnrollToCourse("Manual Testing Certification Training");
	  
  }
 
  @BeforeSuite
  public void OpenBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\InstallationStuff\\ExeFiles_Browser Drivers\\chromedriver74.0.3729.6_win32.exe");
		driver = new ChromeDriver();
		
		
		 driver.manage().window().maximize();
		 driver.get("https://www.edureka.co");
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
  }

  @AfterSuite
  public void Cancel() {
	  
	  driver.close();
  }

}
