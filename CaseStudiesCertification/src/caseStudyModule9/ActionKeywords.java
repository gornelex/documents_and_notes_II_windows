package caseStudyModule9;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
	
	static WebDriver driver;
	static JavascriptExecutor jse;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\InstallationStuff\\ExeFiles_Browser Drivers\\chromedriver74.0.3729.6_win32.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		
		System.out.println("Browser Initialized Succesfully");
	}
	
	public static void logIn() throws Exception {
		
		
		
		
		String emailID = ReadExcelFile.getData(4, 0);
		String passwd = ReadExcelFile.getData(4, 1);
		
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("si_popup_email")).sendKeys(emailID);
		driver.findElement(By.id("si_popup_passwd")).sendKeys(passwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		Thread.sleep(2000);
			
		System.out.println("LogIn Done Succesfully");
	}
	
	
	public static void seleniumBlogsNavigation() {
			
		driver.findElement(By.id("dropdownMenu4")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[4]/div/ul/li[2]/a")).click();
		
		
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 String handleName = tabs.get(1);driver.switchTo().window(handleName);
		 
		 jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 500)");
			
			driver.findElement(By.xpath("//a[@data-category='Software Testing']")).click();
			driver.findElement(By.xpath("//a[@data-category=\"Software Testing\" and text()='READ MORE ']")).click();

			
			System.out.println("Selenium Blogs Page Opened Succesfully");
	}
	
	
}