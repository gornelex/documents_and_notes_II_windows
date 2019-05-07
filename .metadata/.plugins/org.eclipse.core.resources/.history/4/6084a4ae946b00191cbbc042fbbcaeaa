package mavenTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;



public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void testEasy() {
	  
	  driver.get("https://www.edureka.co");
	  String title = driver.getTitle();
	  
	  Assert.assertTrue(title.contains("Instructor-Led"));
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\InstallationStuff\\ExeFiles_Browser Drivers\\chromedriver74.0.3729.6_win32.exe");
	 driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
