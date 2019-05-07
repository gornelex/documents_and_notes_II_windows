package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleAT {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\InstallationStuff\\ExeFiles_Browser Drivers\\chromedriver74.0.3729.6_win32.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		
		//Login to Edureka.co
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("si_popup_email")).sendKeys("gornelex1986@gmail.com");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("guadalupe01");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		Thread.sleep(2000);
			
		System.out.println("LogIn Done Succesfully");
		
		//Looking for profile
		driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-button-name='My Profile']")).click();
		Thread.sleep(2000);
		
		//Click details page
		driver.findElement(By.id("personal_details")).click();
		Thread.sleep(2000);
		
		//select icon camera
		driver.findElement(By.xpath("//i[@class='icon-camera']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='custom-input']")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Selenium\\Programs\\CaseStudiesCertification\\src\\AutoIT\\UploadPicture.exe");
	
		
		driver.close();
	}

}
