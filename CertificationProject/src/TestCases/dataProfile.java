package TestCases;

import org.testng.annotations.Test;

import Utility.ReadExcelFile;
import appModuleActions.updateProfile;
import pomFactoryPages.loginStep;
import pomFactoryPages.searchProfile;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class dataProfile {
	
	WebDriver driver;
	
	String path = "C:\\Selenium\\Programs\\CertificationProject\\src\\dataFolder\\dataTest.xlsx";
	
  @Test
  public void dataProfileTest() throws InterruptedException {
	  
	  searchProfile Profilemenu = new searchProfile(driver);
	  Profilemenu.AccessToProfile();
	  
	  updateProfile ProfileUpdateAction = new updateProfile(driver);
	  ProfileUpdateAction.updateProfileAction();
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
  public void OpenPage() {
	  
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
