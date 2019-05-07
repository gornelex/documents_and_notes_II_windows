package TestNG;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CaseStudy_module7 {
	
	WebDriver driver;
	
	
	
	
	@BeforeSuite
	  public void OpenBrowser() {
		  //Open Browser
		  System.setProperty("webdriver.chrome.driver", "/home/gornelex/Selenium/InstallationStuff/ExeFiles/chromedriver73.0.3683.68_linux64");
			driver = new ChromeDriver();
			
  }
	
	
	
 @BeforeTest
	  public void OpeningSiteand_Search() throws InterruptedException {
		  
		  //Open flipkart page
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			Thread.sleep(3000);
			
			
		 //Search for Selenium book
			driver.findElement(By.name("q")).sendKeys("Selenium book", Keys.ENTER);
			Thread.sleep(3000);
	 }
	
  @Test  
  public void Selectbookandbuy() throws InterruptedException, Exception {
	  
	
	//Select the book this will open a new tab
	  String parentHandle = driver.getWindowHandle(); // get the current window handle 
	  System.out.println(parentHandle);
	  WebElement seleniumbook = driver.findElement(By.xpath("//a[@class='_2cLu-l' and @title='Selenium WebDriver 1st  Edition']"));
	  seleniumbook.click();// click some link that opens a new window 

	  for (String winHandle : driver.getWindowHandles()) { 
	      driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window) 
	  } 
	  
	
	  PinCode_Duration(); //code to applied
	  

	  
	 	
  

	  
	  driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	  Thread.sleep(3000);
	  
	 
	  
	 try {
	 driver.findElement(By.xpath("//button[@class='_2AkmmA _14O7kc _7UHT_c']")).click();
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//input[@class='_2zrpKA _2rqcw- _3v41xv']")).sendKeys("gornelex@gmail.com");
	 driver.findElement(By.xpath("//input[@class='_2zrpKA _14H79F']")).sendKeys("3311567890");
	 Thread.sleep(3000);
	
	/* we generate a code to try find an element to force an error and take the screenshot. It's supposed if we
	  have the correct data we can go forward and wait for another element to complete the test but this is not the case*/
	 driver.findElement(By.xpath("//input[@class='6789']")).sendKeys("password");
	  }	
	 
	 
	
	 catch (Exception e)
     {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     	FileUtils.copyFile(screenshot, new File("/home/gornelex/Selenium/Programs/CaseStudies/images/"+System.currentTimeMillis()+".jpg"));
     	System.out.println("Screenshot is captured for failed testcase");
		 
     }
	  
}



  @AfterSuite
  public void CloseBrowser() {
	  
	 driver.close();
  }

public void PinCode_Duration() throws InterruptedException {
	 
	  
	  //Entering the ping code
	  String pincode = "110001";
	 driver.findElement(By.id("pincodeInputId")).sendKeys(pincode);;
	  //delivery time or duration
	 driver.findElement(By.xpath("//span[contains(text(), 'View Details')]")).click();
	 
	 
	
	 
	  
	  WebElement delivery = driver.findElement(By.xpath("//span[@class='kUhIIX']"));
	  String time_delivery = delivery.getText();
	  Thread.sleep(3000);
	  
	  System.out.println("Delivery PinCode: " + pincode);
	  System.out.println("Delivery by: " + time_delivery);
	  
	  driver.findElement(By.xpath("//button[@class='_2AkmmA _2Rr3iH']")).click();
	  Thread.sleep(3000);
	  
}
  
  
}
