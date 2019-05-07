package TestCases;

import org.testng.annotations.Test;

import Utility.ReadExcelFile;
import pomFactoryPages.BlogsSelenium;
import pomFactoryPages.loginStep;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class seleniumBlogs {

	WebDriver driver;
	JavascriptExecutor jse;
	String path = "C:\\Selenium\\Programs\\CertificationProject\\src\\dataFolder\\dataTest.xlsx";
	
  @Test
  public void seleniumBlogsTest() throws InterruptedException {
	  
	 BlogsSelenium findSeleniumblogs = new BlogsSelenium(driver);
	 findSeleniumblogs.AccessToBlogs();
	 
	 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	 String handleName = tabs.get(1);driver.switchTo().window(handleName);
	 
	 jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 500)");
		
	findSeleniumblogs.AccessToSeleniumBlogs();
	Thread.sleep(5000);

	 
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 6000)");
	 
		
		Thread.sleep(5000);
		
		driver.close();
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
	  
	  driver.quit();
  }

}
